package com.example.freeweatherapp.data.remote.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyUnits(
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
    @SerialName("precipitation_probability")
    val precipitationProbability: String ?= null,
    @SerialName("precipitation")
    val precipitation: String ?= null,
    @SerialName("rain")
    val rain: String ?= null,
    @SerialName("showers")
    val showers: String ?= null,
    @SerialName("snowfall")
    val snowfall: String ?= null,
    @SerialName("snow_depth")
    val snowDepth: String ?= null,
    @SerialName("weather_code")
    val weatherCode: String ?= null,
    @SerialName("pressure_msl")
    val pressureMsl: String ?= null,
    @SerialName("surface_pressure")
    val surfacePressure: String ?= null,
    @SerialName("cloud_cover")
    val cloudCover: String ?= null,
    @SerialName("cloud_cover_low")
    val cloudCoverLow: String ?= null,
    @SerialName("cloud_cover_mid")
    val cloudCoverMid: String ?= null,
    @SerialName("cloud_cover_high")
    val cloudCoverHigh: String ?= null,
    @SerialName("visibility")
    val visibility: String ?= null,
    @SerialName("evapotranspiration")
    val evapotranspiration: String ?= null,
    @SerialName("et0_fao_evapotranspiration")
    val et0FaoEvapotranspiration: String ?= null,
    @SerialName("vapour_pressure_deficit")
    val vapourPressureDeficit: String ?= null,
    val windSpeed: HourlyUnitsWindSpeed?= null,
    val windDirection: HourlyUnitsWindDirection?= null,
    @SerialName("wind_gusts_10m")
    val windGusts10m: String ?= null,
    val hourlyTemperature: HourlyUnitsTemperature?= null,
    val soilTemperature: HourlyUnitsSoilTemperature?= null,
    val soilMoisture: HourlyUnitsSoilMoisture?= null,
    @SerialName("uv_index")
    val uvIndex: String ?= null,
    @SerialName("uv_index_clear_sky")
    val uvIndexClearSky: String ?= null,
    @SerialName("is_day")
    val isDay: String ?= null,
    @SerialName("sunshine_duration")
    val sunshineDuration: String ?= null,
    @SerialName("wet_bulb_temperature_2m")
    val wetBulbTemperature2m: String ?= null,
    @SerialName("total_column_integrated_water_vapour")
    val totalColumnIntegratedWaterVapour: String ?= null,
    @SerialName("cape")
    val cape: String ?= null,
    @SerialName("lifted_index")
    val liftedIndex: String ?= null,
    @SerialName("convective_inhibition")
    val convectiveInhibition: String ?= null,
    @SerialName("freezing_level_height")
    val freezingLevelHeight: String ?= null,
    @SerialName("boundary_layer_height")
    val boundaryLayerHeight: String ?= null,
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
    val terrestrialRadiationInstant: String ?= null,
    val temperatureHpa: HourlyUnitsTemperatureHpa?= null,
    val relativeHumidityHpa: HourlyUnitsRelativeHumidityHpa?= null,
    val cloudCoverHpa: HourlyUnitsCloudCoverHpa?= null,
    val windSpeedHpa: HourlyUnitsWindSpeedHpa?= null,
    val windDirectionHpa: HourlyUnitsWindDirection?= null,
    val geopotentialHeightHpa: HourlyUnitsGeopotentialHeightHpa?= null
)