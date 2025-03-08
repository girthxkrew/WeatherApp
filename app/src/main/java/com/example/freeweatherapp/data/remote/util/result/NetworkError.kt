package com.example.freeweatherapp.data.remote.util.result

import com.example.freeweatherapp.util.result.Error

sealed interface NetworkError : Error {
    enum class APIError : Error {
        NO_INTERNET,
        REQUEST_TIMEOUT,
        TOO_MANY_REQUESTS,
        CONNECTION_TIMEOUT,
        PAYLOAD_TOO_LARGE,
        UNAUTHORIZED,
        FORBIDDEN,
        NOT_FOUND,
        SERVER_ERROR,
        SERIALIZATION,
        UNKNOWN
    }
}