package com.example.freeweatherapp.data.remote.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastDTO(
    @SerialName("latitude")
    val latitude: Double ?= null,
    @SerialName("longitude")
    val longitude: Double ?= null,
    @SerialName("generationtime_ms")
    val generationtimeMs: Double ?= null,
    @SerialName("utc_offset_seconds")
    val utcOffsetSeconds: Int ?= null,
    @SerialName("timezone")
    val timezone: String ?= null,
    @SerialName("timezone_abbreviation")
    val timezoneAbbreviation: String ?= null,
    @SerialName("elevation")
    val elevation: Double ?= null,
    @SerialName("current_units")
    val currentUnits: CurrentUnits?= null,
    @SerialName("current")
    val current: Current?= null,
    @SerialName("minutely_15_units")
    val minutely15Units: Minutely15Units?= null,
    @SerialName("minutely_15")
    val minutely15: Minutely15?= null,
    @SerialName("hourly_units")
    val hourlyUnits: HourlyUnits?= null,
    @SerialName("hourly")
    val hourly: Hourly?= null,
    @SerialName("daily_units")
    val dailyUnits: DailyUnits?= null,
    @SerialName("daily")
    val daily: Daily?= null,
    @SerialName("location_id")
    val locationId: Int? = null
)