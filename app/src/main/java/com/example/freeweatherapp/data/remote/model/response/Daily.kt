package com.example.freeweatherapp.data.remote.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Daily(
    @SerialName("time")
    val time: List<Int> ?= null,
    @SerialName("weather_code")
    val weatherCode: List<Int> ?= null,
    @SerialName("temperature_2m_max")
    val temperature2mMax: List<Double> ?= null,
    @SerialName("temperature_2m_min")
    val temperature2mMin: List<Double> ?= null,
    @SerialName("apparent_temperature_max")
    val apparentTemperatureMax: List<Double> ?= null,
    @SerialName("apparent_temperature_min")
    val apparentTemperatureMin: List<Double> ?= null,
    @SerialName("sunrise")
    val sunrise: List<Int> ?= null,
    @SerialName("sunset")
    val sunset: List<Int> ?= null,
    @SerialName("daylight_duration")
    val daylightDuration: List<Double> ?= null,
    @SerialName("sunshine_duration")
    val sunshineDuration: List<Double> ?= null,
    @SerialName("uv_index_max")
    val uvIndexMax: List<Double> ?= null,
    @SerialName("uv_index_clear_sky_max")
    val uvIndexClearSkyMax: List<Double> ?= null,
    @SerialName("precipitation_sum")
    val precipitationSum: List<Double> ?= null,
    @SerialName("rain_sum")
    val rainSum: List<Double> ?= null,
    @SerialName("showers_sum")
    val showersSum: List<Double> ?= null,
    @SerialName("snowfall_sum")
    val snowfallSum: List<Double> ?= null,
    @SerialName("precipitation_hours")
    val precipitationHours: List<Double> ?= null,
    @SerialName("precipitation_probability_max")
    val precipitationProbabilityMax: List<Int> ?= null,
    @SerialName("wind_speed_10m_max")
    val windSpeed10mMax: List<Double> ?= null,
    @SerialName("wind_gusts_10m_max")
    val windGusts10mMax: List<Double> ?= null,
    @SerialName("wind_direction_10m_dominant")
    val windDirection10mDominant: List<Int> ?= null,
    @SerialName("shortwave_radiation_sum")
    val shortwaveRadiationSum: List<Double> ?= null,
    @SerialName("et0_fao_evapotranspiration")
    val et0FaoEvapotranspiration: List<Double> ?= null
)