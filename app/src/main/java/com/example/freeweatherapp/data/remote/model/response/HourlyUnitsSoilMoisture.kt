package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyUnitsSoilMoisture(
    @SerialName("soil_moisture_0_to_1cm")
    val soilMoisture0To1cm: String ?= null,
    @SerialName("soil_moisture_1_to_3cm")
    val soilMoisture1To3cm: String ?= null,
    @SerialName("soil_moisture_3_to_9cm")
    val soilMoisture3To9cm: String ?= null,
    @SerialName("soil_moisture_9_to_27cm")
    val soilMoisture9To27cm: String ?= null,
    @SerialName("soil_moisture_27_to_81cm")
    val soilMoisture27To81cm: String ?= null
)
