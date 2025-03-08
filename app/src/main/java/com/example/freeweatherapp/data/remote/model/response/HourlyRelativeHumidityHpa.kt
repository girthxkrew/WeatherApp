package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyRelativeHumidityHpa(
    @SerialName("relative_humidity_1000hPa")
    val relativeHumidity1000hPa: List<Int> ?= null,
    @SerialName("relative_humidity_975hPa")
    val relativeHumidity975hPa: List<Int> ?= null,
    @SerialName("relative_humidity_950hPa")
    val relativeHumidity950hPa: List<Int> ?= null,
    @SerialName("relative_humidity_925hPa")
    val relativeHumidity925hPa: List<Int> ?= null,
    @SerialName("relative_humidity_900hPa")
    val relativeHumidity900hPa: List<Int> ?= null,
    @SerialName("relative_humidity_850hPa")
    val relativeHumidity850hPa: List<Int> ?= null,
    @SerialName("relative_humidity_800hPa")
    val relativeHumidity800hPa: List<Int> ?= null,
    @SerialName("relative_humidity_700hPa")
    val relativeHumidity700hPa: List<Int> ?= null,
    @SerialName("relative_humidity_600hPa")
    val relativeHumidity600hPa: List<Int> ?= null,
    @SerialName("relative_humidity_500hPa")
    val relativeHumidity500hPa: List<Int> ?= null,
    @SerialName("relative_humidity_400hPa")
    val relativeHumidity400hPa: List<Int> ?= null,
    @SerialName("relative_humidity_300hPa")
    val relativeHumidity300hPa: List<Int> ?= null,
    @SerialName("relative_humidity_250hPa")
    val relativeHumidity250hPa: List<Int> ?= null,
    @SerialName("relative_humidity_200hPa")
    val relativeHumidity200hPa: List<Int> ?= null,
    @SerialName("relative_humidity_150hPa")
    val relativeHumidity150hPa: List<Int> ?= null,
    @SerialName("relative_humidity_100hPa")
    val relativeHumidity100hPa: List<Int> ?= null,
    @SerialName("relative_humidity_70hPa")
    val relativeHumidity70hPa: List<Int> ?= null,
    @SerialName("relative_humidity_50hPa")
    val relativeHumidity50hPa: List<Int> ?= null,
    @SerialName("relative_humidity_30hPa")
    val relativeHumidity30hPa: List<Int> ?= null
)
