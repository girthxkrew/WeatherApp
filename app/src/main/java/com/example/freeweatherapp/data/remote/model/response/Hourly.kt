package com.example.freeweatherapp.data.remote.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Hourly(
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
    @SerialName("precipitation_probability")
    val precipitationProbability: List<Int> ?= null,
    @SerialName("precipitation")
    val precipitation: List<Double> ?= null,
    @SerialName("rain")
    val rain: List<Double> ?= null,
    @SerialName("showers")
    val showers: List<Double> ?= null,
    @SerialName("snowfall")
    val snowfall: List<Double> ?= null,
    @SerialName("snow_depth")
    val snowDepth: List<Double> ?= null,
    @SerialName("weather_code")
    val weatherCode: List<Int> ?= null,
    @SerialName("pressure_msl")
    val pressureMsl: List<Double> ?= null,
    @SerialName("surface_pressure")
    val surfacePressure: List<Double> ?= null,
    @SerialName("cloud_cover")
    val cloudCover: List<Int> ?= null,
    @SerialName("cloud_cover_low")
    val cloudCoverLow: List<Int> ?= null,
    @SerialName("cloud_cover_mid")
    val cloudCoverMid: List<Int> ?= null,
    @SerialName("cloud_cover_high")
    val cloudCoverHigh: List<Int> ?= null,
    @SerialName("visibility")
    val visibility: List<Double> ?= null,
    @SerialName("evapotranspiration")
    val evapotranspiration: List<Double> ?= null,
    @SerialName("et0_fao_evapotranspiration")
    val et0FaoEvapotranspiration: List<Double> ?= null,
    @SerialName("vapour_pressure_deficit")
    val vapourPressureDeficit: List<Double> ?= null,
    val windSpeed: HourlyWindSpeed?= null,
    val windDirection: HourlyWindDirection?= null,
    @SerialName("wind_gusts_10m")
    val windGusts10m: List<Double> ?= null,
    val temperature: HourlyTemperature?= null,
    val soilTemperature: HourlySoilTemperature?= null,
    val soilMoisture: HourlySoilMoisture?= null,
    @SerialName("uv_index")
    val uvIndex: List<Double> ?= null,
    @SerialName("uv_index_clear_sky")
    val uvIndexClearSky: List<Double> ?= null,
    @SerialName("is_day")
    val isDay: List<Int> ?= null,
    @SerialName("sunshine_duration")
    val sunshineDuration: List<Double> ?= null,
    @SerialName("wet_bulb_temperature_2m")
    val wetBulbTemperature2m: List<Double> ?= null,
    @SerialName("total_column_integrated_water_vapour")
    val totalColumnIntegratedWaterVapour: List<Double> ?= null,
    @SerialName("cape")
    val cape: List<Double> ?= null,
    @SerialName("lifted_index")
    val liftedIndex: List<Double> ?= null,
    @SerialName("convective_inhibition")
    val convectiveInhibition: List<Double> ?= null,
    @SerialName("freezing_level_height")
    val freezingLevelHeight: List<Double> ?= null,
    @SerialName("boundary_layer_height")
    val boundaryLayerHeight: List<Double> ?= null,
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
    val terrestrialRadiationInstant: List<Double> ?= null,
    val temperatureHpa: HourlyTemperatureHpa?= null,
    val relativeHumidityHpa: HourlyRelativeHumidityHpa?= null,
    val hourlyCloudCoverHpa: HourlyCloudCoverHpa?= null,
    val windSpeedHpa: HourlyWindSpeedHpa?= null,
    val windDirection1000hPa: List<Int> ?= null,
    val windDirectionHpa: HourlyWindDirectionHpa?= null,
    val geopotentialHeightHpa: HourlyGeopotentialHeightHpa?= null
)