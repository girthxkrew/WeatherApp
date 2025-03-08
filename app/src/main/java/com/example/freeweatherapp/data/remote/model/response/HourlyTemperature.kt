package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyTemperature(
    @SerialName("temperature_80m")
    val temperature80m: List<Double> ?= null,
    @SerialName("temperature_120m")
    val temperature120m: List<Double> ?= null,
    @SerialName("temperature_180m")
    val temperature180m: List<Double> ?= null,
)
