package com.example.freeweatherapp.data.remote.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Minutely15Units(
    @SerialName("time")
    val time: String ?= null,
    @SerialName("temperature_2m")
    val temperature2m: String ?= null,
    @SerialName("relative_humidity_2m")
    val relativeHumidity2m: String ?= null,
    @SerialName("dew_point_2m")
    val dewPoint2m: String ?= null,
    @SerialName("apparent_temperature")
    val apparentTemperature: String ?= null,
    @SerialName("precipitation")
    val precipitation: String ?= null,
    @SerialName("rain")
    val rain: String ?= null,
    @SerialName("snowfall")
    val snowfall: String ?= null,
    @SerialName("snowfall_height")
    val snowfallHeight: String ?= null,
    @SerialName("freezing_level_height")
    val freezingLevelHeight: String ?= null,
    @SerialName("sunshine_duration")
    val sunshineDuration: String ?= null,
    @SerialName("weather_code")
    val weatherCode: String ?= null,
    @SerialName("wind_speed_10m")
    val windSpeed10m: String ?= null,
    @SerialName("wind_speed_80m")
    val windSpeed80m: String ?= null,
    @SerialName("wind_direction_10m")
    val windDirection10m: String ?= null,
    @SerialName("wind_direction_80m")
    val windDirection80m: String ?= null,
    @SerialName("wind_gusts_10m")
    val windGusts10m: String ?= null,
    @SerialName("visibility")
    val visibility: String ?= null,
    @SerialName("cape")
    val cape: String ?= null,
    @SerialName("lightning_potential")
    val lightningPotential: String ?= null,
    @SerialName("is_day")
    val isDay: String ?= null,
    @SerialName("shortwave_radiation")
    val shortwaveRadiation: String ?= null,
    @SerialName("direct_radiation")
    val directRadiation: String ?= null,
    @SerialName("diffuse_radiation")
    val diffuseRadiation: String ?= null,
    @SerialName("direct_normal_irradiance")
    val directNormalIrradiance: String ?= null,
    @SerialName("global_tilted_irradiance")
    val globalTiltedIrradiance: String ?= null,
    @SerialName("terrestrial_radiation")
    val terrestrialRadiation: String ?= null,
    @SerialName("shortwave_radiation_instant")
    val shortwaveRadiationInstant: String ?= null,
    @SerialName("direct_radiation_instant")
    val directRadiationInstant: String ?= null,
    @SerialName("diffuse_radiation_instant")
    val diffuseRadiationInstant: String ?= null,
    @SerialName("direct_normal_irradiance_instant")
    val directNormalIrradianceInstant: String ?= null,
    @SerialName("global_tilted_irradiance_instant")
    val globalTiltedIrradianceInstant: String ?= null,
    @SerialName("terrestrial_radiation_instant")
    val terrestrialRadiationInstant: String ?= null
)