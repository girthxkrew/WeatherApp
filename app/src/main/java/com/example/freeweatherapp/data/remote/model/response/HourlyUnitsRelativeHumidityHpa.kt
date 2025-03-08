package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyUnitsRelativeHumidityHpa(
    @SerialName("relative_humidity_1000hPa")
    val relativeHumidity1000hPa: String ?= null,
    @SerialName("relative_humidity_975hPa")
    val relativeHumidity975hPa: String ?= null,
    @SerialName("relative_humidity_950hPa")
    val relativeHumidity950hPa: String ?= null,
    @SerialName("relative_humidity_925hPa")
    val relativeHumidity925hPa: String ?= null,
    @SerialName("relative_humidity_900hPa")
    val relativeHumidity900hPa: String ?= null,
    @SerialName("relative_humidity_850hPa")
    val relativeHumidity850hPa: String ?= null,
    @SerialName("relative_humidity_800hPa")
    val relativeHumidity800hPa: String ?= null,
    @SerialName("relative_humidity_700hPa")
    val relativeHumidity700hPa: String ?= null,
    @SerialName("relative_humidity_600hPa")
    val relativeHumidity600hPa: String ?= null,
    @SerialName("relative_humidity_500hPa")
    val relativeHumidity500hPa: String ?= null,
    @SerialName("relative_humidity_400hPa")
    val relativeHumidity400hPa: String ?= null,
    @SerialName("relative_humidity_300hPa")
    val relativeHumidity300hPa: String ?= null,
    @SerialName("relative_humidity_250hPa")
    val relativeHumidity250hPa: String ?= null,
    @SerialName("relative_humidity_200hPa")
    val relativeHumidity200hPa: String ?= null,
    @SerialName("relative_humidity_150hPa")
    val relativeHumidity150hPa: String ?= null,
    @SerialName("relative_humidity_100hPa")
    val relativeHumidity100hPa: String ?= null,
    @SerialName("relative_humidity_70hPa")
    val relativeHumidity70hPa: String ?= null,
    @SerialName("relative_humidity_50hPa")
    val relativeHumidity50hPa: String ?= null,
    @SerialName("relative_humidity_30hPa")
    val relativeHumidity30hPa: String ?= null,
)
