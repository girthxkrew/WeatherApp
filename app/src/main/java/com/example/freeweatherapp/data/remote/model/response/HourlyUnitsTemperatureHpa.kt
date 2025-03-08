package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyUnitsTemperatureHpa(
    @SerialName("temperature_1000hPa")
    val temperature1000hPa: String ?= null,
    @SerialName("temperature_975hPa")
    val temperature975hPa: String ?= null,
    @SerialName("temperature_950hPa")
    val temperature950hPa: String ?= null,
    @SerialName("temperature_925hPa")
    val temperature925hPa: String ?= null,
    @SerialName("temperature_900hPa")
    val temperature900hPa: String ?= null,
    @SerialName("temperature_850hPa")
    val temperature850hPa: String ?= null,
    @SerialName("temperature_800hPa")
    val temperature800hPa: String ?= null,
    @SerialName("temperature_700hPa")
    val temperature700hPa: String ?= null,
    @SerialName("temperature_600hPa")
    val temperature600hPa: String ?= null,
    @SerialName("temperature_500hPa")
    val temperature500hPa: String ?= null,
    @SerialName("temperature_400hPa")
    val temperature400hPa: String ?= null,
    @SerialName("temperature_300hPa")
    val temperature300hPa: String ?= null,
    @SerialName("temperature_250hPa")
    val temperature250hPa: String ?= null,
    @SerialName("temperature_200hPa")
    val temperature200hPa: String ?= null,
    @SerialName("temperature_150hPa")
    val temperature150hPa: String ?= null,
    @SerialName("temperature_100hPa")
    val temperature100hPa: String ?= null,
    @SerialName("temperature_70hPa")
    val temperature70hPa: String ?= null,
    @SerialName("temperature_50hPa")
    val temperature50hPa: String ?= null,
    @SerialName("temperature_30hPa")
    val temperature30hPa: String ?= null
)
