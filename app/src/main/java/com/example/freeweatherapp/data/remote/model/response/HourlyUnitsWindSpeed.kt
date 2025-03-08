package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyUnitsWindSpeed(
    @SerialName("wind_speed_10m")
    val windSpeed10m: String ?= null,
    @SerialName("wind_speed_80m")
    val windSpeed80m: String ?= null,
    @SerialName("wind_speed_120m")
    val windSpeed120m: String ?= null,
    @SerialName("wind_speed_180m")
    val windSpeed180m: String ?= null
)
