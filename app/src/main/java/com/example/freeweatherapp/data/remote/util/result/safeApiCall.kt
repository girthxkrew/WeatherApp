package com.example.freeweatherapp.data.remote.util.result

import com.rkm.tasky.util.result.Result
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse
import io.ktor.http.HttpStatusCode
import io.ktor.http.isSuccess
import io.ktor.serialization.JsonConvertException
import java.io.IOException
import java.net.SocketTimeoutException

suspend inline fun <reified T> safeCall(execute: () -> HttpResponse): Result<T, NetworkError.APIError> {
    val response = try {
        execute()
    } catch (e: IOException) {
        return Result.Error(NetworkError.APIError.NO_INTERNET)
    }catch (e: SocketTimeoutException){
        return Result.Error(NetworkError.APIError.CONNECTION_TIMEOUT)
    } catch (e: JsonConvertException) {
        return Result.Error(NetworkError.APIError.SERIALIZATION)
    } catch (e: Exception) {
        return Result.Error(NetworkError.APIError.UNKNOWN)
    }
    return responseToResult(response)
}

suspend inline fun <reified T> responseToResult(response: HttpResponse): Result<T, NetworkError.APIError> {
    if (response.status.isSuccess()) {
        return try {
            Result.Success(response.body<T>())
        } catch (e: NoTransformationFoundException) {
            Result.Error(NetworkError.APIError.SERIALIZATION)
        }
    }

    return when (response.status) {
        HttpStatusCode.Unauthorized -> Result.Error(NetworkError.APIError.UNAUTHORIZED)
        HttpStatusCode.Forbidden -> Result.Error(NetworkError.APIError.FORBIDDEN)
        HttpStatusCode.NotFound -> Result.Error(NetworkError.APIError.NOT_FOUND)
        HttpStatusCode.RequestTimeout -> Result.Error(NetworkError.APIError.REQUEST_TIMEOUT)
        HttpStatusCode.PayloadTooLarge -> Result.Error(NetworkError.APIError.PAYLOAD_TOO_LARGE)
        HttpStatusCode.TooManyRequests -> Result.Error(NetworkError.APIError.TOO_MANY_REQUESTS)
        in HttpStatusCode.InternalServerError..HttpStatusCode.InsufficientStorage -> Result.Error(NetworkError.APIError.SERVER_ERROR)
        else -> Result.Error(NetworkError.APIError.UNKNOWN)
    }
}