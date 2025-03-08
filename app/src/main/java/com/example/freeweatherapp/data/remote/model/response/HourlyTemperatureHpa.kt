package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyTemperatureHpa(
    @SerialName("temperature_1000hPa")
    val temperature1000hPa: List<Double> ?= null,
    @SerialName("temperature_975hPa")
    val temperature975hPa: List<Double> ?= null,
    @SerialName("temperature_950hPa")
    val temperature950hPa: List<Double> ?= null,
    @SerialName("temperature_925hPa")
    val temperature925hPa: List<Double> ?= null,
    @SerialName("temperature_900hPa")
    val temperature900hPa: List<Double> ?= null,
    @SerialName("temperature_850hPa")
    val temperature850hPa: List<Double> ?= null,
    @SerialName("temperature_800hPa")
    val temperature800hPa: List<Double> ?= null,
    @SerialName("temperature_700hPa")
    val temperature700hPa: List<Double> ?= null,
    @SerialName("temperature_600hPa")
    val temperature600hPa: List<Double> ?= null,
    @SerialName("temperature_500hPa")
    val temperature500hPa: List<Double> ?= null,
    @SerialName("temperature_400hPa")
    val temperature400hPa: List<Double> ?= null,
    @SerialName("temperature_300hPa")
    val temperature300hPa: List<Double> ?= null,
    @SerialName("temperature_250hPa")
    val temperature250hPa: List<Double> ?= null,
    @SerialName("temperature_200hPa")
    val temperature200hPa: List<Double> ?= null,
    @SerialName("temperature_150hPa")
    val temperature150hPa: List<Double> ?= null,
    @SerialName("temperature_100hPa")
    val temperature100hPa: List<Double> ?= null,
    @SerialName("temperature_70hPa")
    val temperature70hPa: List<Double> ?= null,
    @SerialName("temperature_50hPa")
    val temperature50hPa: List<Double> ?= null,
    @SerialName("temperature_30hPa")
    val temperature30hPa: List<Double> ?= null,
)
