package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyUnitsWindDirectionHpa(
    @SerialName("wind_direction_1000hPa")
    val windDirection1000hPa: String ?= null,
    @SerialName("wind_direction_975hPa")
    val windDirection975hPa: String ?= null,
    @SerialName("wind_direction_950hPa")
    val windDirection950hPa: String ?= null,
    @SerialName("wind_direction_925hPa")
    val windDirection925hPa: String ?= null,
    @SerialName("wind_direction_900hPa")
    val windDirection900hPa: String ?= null,
    @SerialName("wind_direction_850hPa")
    val windDirection850hPa: String ?= null,
    @SerialName("wind_direction_800hPa")
    val windDirection800hPa: String ?= null,
    @SerialName("wind_direction_700hPa")
    val windDirection700hPa: String ?= null,
    @SerialName("wind_direction_600hPa")
    val windDirection600hPa: String ?= null,
    @SerialName("wind_direction_500hPa")
    val windDirection500hPa: String ?= null,
    @SerialName("wind_direction_400hPa")
    val windDirection400hPa: String ?= null,
    @SerialName("wind_direction_300hPa")
    val windDirection300hPa: String ?= null,
    @SerialName("wind_direction_250hPa")
    val windDirection250hPa: String ?= null,
    @SerialName("wind_direction_200hPa")
    val windDirection200hPa: String ?= null,
    @SerialName("wind_direction_150hPa")
    val windDirection150hPa: String ?= null,
    @SerialName("wind_direction_100hPa")
    val windDirection100hPa: String ?= null,
    @SerialName("wind_direction_70hPa")
    val windDirection70hPa: String ?= null,
    @SerialName("wind_direction_50hPa")
    val windDirection50hPa: String ?= null,
    @SerialName("wind_direction_30hPa")
    val windDirection30hPa: String ?= null
)
