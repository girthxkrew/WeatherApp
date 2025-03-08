package com.example.freeweatherapp.data.remote.datasource.abstraction

import com.example.freeweatherapp.data.remote.model.request.Location
import com.example.freeweatherapp.data.remote.model.response.ForecastDTO
import com.example.freeweatherapp.data.remote.util.result.NetworkError
import com.rkm.tasky.util.result.Result

interface WeatherRemoteDataSource {
    suspend fun getDailyForecast(location: Location): Result<ForecastDTO, NetworkError.APIError>
    suspend fun getTenDayForecast(vararg locations: Location): Result<List<ForecastDTO>, NetworkError.APIError>
}