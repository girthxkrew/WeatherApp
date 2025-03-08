package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyUnitsWindSpeedHpa(
    @SerialName("wind_speed_1000hPa")
    val windSpeed1000hPa: String ?= null,
    @SerialName("wind_speed_975hPa")
    val windSpeed975hPa: String ?= null,
    @SerialName("wind_speed_950hPa")
    val windSpeed950hPa: String ?= null,
    @SerialName("wind_speed_925hPa")
    val windSpeed925hPa: String ?= null,
    @SerialName("wind_speed_900hPa")
    val windSpeed900hPa: String ?= null,
    @SerialName("wind_speed_850hPa")
    val windSpeed850hPa: String ?= null,
    @SerialName("wind_speed_800hPa")
    val windSpeed800hPa: String ?= null,
    @SerialName("wind_speed_700hPa")
    val windSpeed700hPa: String ?= null,
    @SerialName("wind_speed_600hPa")
    val windSpeed600hPa: String ?= null,
    @SerialName("wind_speed_500hPa")
    val windSpeed500hPa: String ?= null,
    @SerialName("wind_speed_400hPa")
    val windSpeed400hPa: String ?= null,
    @SerialName("wind_speed_300hPa")
    val windSpeed300hPa: String ?= null,
    @SerialName("wind_speed_250hPa")
    val windSpeed250hPa: String ?= null,
    @SerialName("wind_speed_200hPa")
    val windSpeed200hPa: String ?= null,
    @SerialName("wind_speed_150hPa")
    val windSpeed150hPa: String ?= null,
    @SerialName("wind_speed_100hPa")
    val windSpeed100hPa: String ?= null,
    @SerialName("wind_speed_70hPa")
    val windSpeed70hPa: String ?= null,
    @SerialName("wind_speed_50hPa")
    val windSpeed50hPa: String ?= null,
    @SerialName("wind_speed_30hPa")
    val windSpeed30hPa: String ?= null
)