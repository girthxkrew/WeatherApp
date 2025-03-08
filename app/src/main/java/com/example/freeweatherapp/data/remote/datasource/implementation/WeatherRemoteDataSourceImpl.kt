package com.example.freeweatherapp.data.remote.datasource.implementation

import android.util.Log
import com.example.freeweatherapp.data.remote.datasource.abstraction.WeatherRemoteDataSource
import com.example.freeweatherapp.data.remote.mapper.toCoordinate
import com.example.freeweatherapp.data.remote.model.request.Location
import com.example.freeweatherapp.data.remote.model.response.ForecastDTO
import com.example.freeweatherapp.data.remote.util.builder.HttpRequestBuilder
import com.example.freeweatherapp.data.remote.util.builder.enums.ApiVersion
import com.example.freeweatherapp.data.remote.util.builder.enums.DailyParameter
import com.example.freeweatherapp.data.remote.util.builder.enums.HourlyParameter
import com.example.freeweatherapp.data.remote.util.builder.enums.PrecipitationUnit
import com.example.freeweatherapp.data.remote.util.builder.enums.TimeFormat
import com.example.freeweatherapp.data.remote.util.builder.enums.WindSpeedUnit
import com.example.freeweatherapp.data.remote.util.result.NetworkError
import com.example.freeweatherapp.data.remote.util.result.safeCall
import com.rkm.tasky.util.result.Result
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import java.util.TimeZone
import javax.inject.Inject

class WeatherRemoteDataSourceImpl @Inject constructor(
    private val client: HttpClient
): WeatherRemoteDataSource {
    override suspend fun getDailyForecast(location: Location): Result<ForecastDTO, NetworkError.APIError> {
        val request = HttpRequestBuilder.builder(ApiVersion.V1)
            .addCoordinate(location.toCoordinate())
            .forecastDays(1)
            .forecastHours(48)
            .timeFormat(TimeFormat.UNIXTIME)
            .precipitationUnit(PrecipitationUnit.INCH)
            .windSpeedUnit(WindSpeedUnit.MPH)
            .daily(*DailyParameter.ALL)
            .hourly(HourlyParameter.APPARENT_TEMPERATURE, HourlyParameter.TEMPERATURE_2M)
            .timezone(TimeZone.getDefault())

        Log.d("WEARESOBACKLOVE", request.build())

        val result = safeCall<ForecastDTO> { client.get(request.build()) }
        return result
    }

    override suspend fun getTenDayForecast(vararg locations: Location): Result<List<ForecastDTO>, NetworkError.APIError> {
        TODO("Not yet implemented")
    }
}