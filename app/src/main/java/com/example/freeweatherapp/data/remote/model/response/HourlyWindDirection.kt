package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyWindDirection(
    @SerialName("wind_direction_10m")
    val windDirection10m: List<Int> ?= null,
    @SerialName("wind_direction_80m")
    val windDirection80m: List<Int> ?= null,
    @SerialName("wind_direction_120m")
    val windDirection120m: List<Int> ?= null,
    @SerialName("wind_direction_180m")
    val windDirection180m: List<Int> ?= null
)
