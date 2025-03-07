package com.example.freeweatherapp.data.remote.util.builder.enums

enum class Minutely15Parameter(val value: String) {
    TEMPERATURE_2M("temperature_2m"),
    RELATIVE_HUMIDITY_2M("relative_humidity_2m"),
    DEW_POINT_2M("dew_point_2m"),
    APPARENT_TEMPERATURE("apparent_temperature"),
    SHORTWAVE_RADIATION("shortwave_radiation"),
    DIRECT_RADIATION("direct_radiation"),
    DIRECT_NORMAL_IRRADIANCE("direct_normal_irradiance"),
    GLOBAL_TILTED_IRRADIANCE("global_tilted_irradiance"),
    GLOBAL_TILTED_IRRADIANCE_INSTANT("global_tilted_irradiance_instant"),
    DIFFUSE_RADIATION("diffuse_radiation"),
    SUNSHINE_DURATION("sunshine_duration"),
    LIGHTNING_POTENTIAL("lightning_potential"),
    PRECIPITATION("precipitation"),
    SNOWFALL("snowfall"),
    RAIN("rain"),
    SHOWERS("showers"),
    SNOWFALL_HEIGHT("snowfall_height"),
    FREEZING_LEVEL_HEIGHT("freezing_level_height"),
    CAPE("cape"),
    WIND_SPEED_10M("wind_speed_10m"),
    WIND_SPEED_80M("wind_speed_80m"),
    WIND_DIRECTION_10M("wind_direction_10m"),
    WIND_DIRECTION_80M("wind_direction_80m"),
    WIND_GUSTS_10M("wind_gusts_10m"),
    VISIBILITY("visibility"),
    WEATHER_CODE("weather_code");

    companion object {
        val ALL : Array<Minutely15Parameter> = entries.toTypedArray()
    }
}