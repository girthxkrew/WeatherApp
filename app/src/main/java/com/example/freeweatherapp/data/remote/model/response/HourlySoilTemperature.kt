package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlySoilTemperature(
    @SerialName("soil_temperature_0cm")
    val soilTemperature0cm: List<Double> ?= null,
    @SerialName("soil_temperature_6cm")
    val soilTemperature6cm: List<Double> ?= null,
    @SerialName("soil_temperature_18cm")
    val soilTemperature18cm: List<Double> ?= null,
    @SerialName("soil_temperature_54cm")
    val soilTemperature54cm: List<Double> ?= null
)
