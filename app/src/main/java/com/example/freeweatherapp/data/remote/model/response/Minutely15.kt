package com.example.freeweatherapp.data.remote.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Minutely15(
    @SerialName("time")
    val time: List<Int> ?= null,
    @SerialName("temperature_2m")
    val temperature2m: List<Double> ?= null,
    @SerialName("relative_humidity_2m")
    val relativeHumidity2m: List<Int> ?= null,
    @SerialName("dew_point_2m")
    val dewPoint2m: List<Double> ?= null,
    @SerialName("apparent_temperature")
    val apparentTemperature: List<Double> ?= null,
    @SerialName("precipitation")
    val precipitation: List<Double> ?= null,
    @SerialName("rain")
    val rain: List<Double> ?= null,
    @SerialName("snowfall")
    val snowfall: List<Double> ?= null,
    @SerialName("snowfall_height")
    val snowfallHeight: List<Double> ?= null,
    @SerialName("freezing_level_height")
    val freezingLevelHeight: List<Double> ?= null,
    @SerialName("sunshine_duration")
    val sunshineDuration: List<Double> ?= null,
    @SerialName("weather_code")
    val weatherCode: List<Int> ?= null,
    @SerialName("wind_speed_10m")
    val windSpeed10m: List<Double> ?= null,
    @SerialName("wind_speed_80m")
    val windSpeed80m: List<Double> ?= null,
    @SerialName("wind_direction_10m")
    val windDirection10m: List<Int> ?= null,
    @SerialName("wind_direction_80m")
    val windDirection80m: List<Int> ?= null,
    @SerialName("wind_gusts_10m")
    val windGusts10m: List<Double> ?= null,
    @SerialName("visibility")
    val visibility: List<Double> ?= null,
    @SerialName("cape")
    val cape: List<Double> ?= null,
    @SerialName("lightning_potential")
    val lightningPotential: List<Double?> ?= null,
    @SerialName("is_day")
    val isDay: List<Int> ?= null,
    @SerialName("shortwave_radiation")
    val shortwaveRadiation: List<Double> ?= null,
    @SerialName("direct_radiation")
    val directRadiation: List<Double> ?= null,
    @SerialName("diffuse_radiation")
    val diffuseRadiation: List<Double> ?= null,
    @SerialName("direct_normal_irradiance")
    val directNormalIrradiance: List<Double> ?= null,
    @SerialName("global_tilted_irradiance")
    val globalTiltedIrradiance: List<Double> ?= null,
    @SerialName("terrestrial_radiation")
    val terrestrialRadiation: List<Double> ?= null,
    @SerialName("shortwave_radiation_instant")
    val shortwaveRadiationInstant: List<Double> ?= null,
    @SerialName("direct_radiation_instant")
    val directRadiationInstant: List<Double> ?= null,
    @SerialName("diffuse_radiation_instant")
    val diffuseRadiationInstant: List<Double> ?= null,
    @SerialName("direct_normal_irradiance_instant")
    val directNormalIrradianceInstant: List<Double> ?= null,
    @SerialName("global_tilted_irradiance_instant")
    val globalTiltedIrradianceInstant: List<Double> ?= null,
    @SerialName("terrestrial_radiation_instant")
    val terrestrialRadiationInstant: List<Double> ?= null
)