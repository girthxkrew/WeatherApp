package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyWindSpeed(
    @SerialName("wind_speed_10m")
    val windSpeed10m: List<Double> ?= null,
    @SerialName("wind_speed_80m")
    val windSpeed80m: List<Double> ?= null,
    @SerialName("wind_speed_120m")
    val windSpeed120m: List<Double>?= null,
    @SerialName("wind_speed_180m")
    val windSpeed180m: List<Double> ?= null
)
