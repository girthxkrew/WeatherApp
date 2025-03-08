package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyUnitsTemperature(
    @SerialName("temperature_80m")
    val temperature80m: String ?= null,
    @SerialName("temperature_120m")
    val temperature120m: String ?= null,
    @SerialName("temperature_180m")
    val temperature180m: String ?= null,
)
