package com.example.freeweatherapp.data.remote.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrentUnits(
    @SerialName("time")
    val time: String ?= null,
    @SerialName("interval")
    val interval: String ?= null,
    @SerialName("temperature_2m")
    val temperature2m: String ?= null,
    @SerialName("relative_humidity_2m")
    val relativeHumidity2m: String ?= null,
    @SerialName("apparent_temperature")
    val apparentTemperature: String ?= null,
    @SerialName("is_day")
    val isDay: String ?= null,
    @SerialName("precipitation")
    val precipitation: String ?= null,
    @SerialName("rain")
    val rain: String ?= null,
    @SerialName("showers")
    val showers: String ?= null,
    @SerialName("snowfall")
    val snowfall: String ?= null,
    @SerialName("weather_code")
    val weatherCode: String ?= null,
    @SerialName("cloud_cover")
    val cloudCover: String ?= null,
    @SerialName("pressure_msl")
    val pressureMsl: String ?= null,
    @SerialName("surface_pressure")
    val surfacePressure: String ?= null,
    @SerialName("wind_speed_10m")
    val windSpeed10m: String ?= null,
    @SerialName("wind_direction_10m")
    val windDirection10m: String ?= null,
    @SerialName("wind_gusts_10m")
    val windGusts10m: String ?= null
)