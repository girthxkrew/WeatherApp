package com.example.freeweatherapp.data.remote.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DailyUnits(
    @SerialName("time")
    val time: String ?= null,
    @SerialName("weather_code")
    val weatherCode: String ?= null,
    @SerialName("temperature_2m_max")
    val temperature2mMax: String ?= null,
    @SerialName("temperature_2m_min")
    val temperature2mMin: String ?= null,
    @SerialName("apparent_temperature_max")
    val apparentTemperatureMax: String ?= null,
    @SerialName("apparent_temperature_min")
    val apparentTemperatureMin: String ?= null,
    @SerialName("sunrise")
    val sunrise: String ?= null,
    @SerialName("sunset")
    val sunset: String ?= null,
    @SerialName("daylight_duration")
    val daylightDuration: String ?= null,
    @SerialName("sunshine_duration")
    val sunshineDuration: String ?= null,
    @SerialName("uv_index_max")
    val uvIndexMax: String ?= null,
    @SerialName("uv_index_clear_sky_max")
    val uvIndexClearSkyMax: String ?= null,
    @SerialName("precipitation_sum")
    val precipitationSum: String ?= null,
    @SerialName("rain_sum")
    val rainSum: String ?= null,
    @SerialName("showers_sum")
    val showersSum: String ?= null,
    @SerialName("snowfall_sum")
    val snowfallSum: String ?= null,
    @SerialName("precipitation_hours")
    val precipitationHours: String ?= null,
    @SerialName("precipitation_probability_max")
    val precipitationProbabilityMax: String ?= null,
    @SerialName("wind_speed_10m_max")
    val windSpeed10mMax: String ?= null,
    @SerialName("wind_gusts_10m_max")
    val windGusts10mMax: String ?= null,
    @SerialName("wind_direction_10m_dominant")
    val windDirection10mDominant: String ?= null,
    @SerialName("shortwave_radiation_sum")
    val shortwaveRadiationSum: String ?= null,
    @SerialName("et0_fao_evapotranspiration")
    val et0FaoEvapotranspiration: String ?= null
)