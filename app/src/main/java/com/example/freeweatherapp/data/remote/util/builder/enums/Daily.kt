package com.example.freeweatherapp.data.remote.util.builder.enums

import com.example.freeweatherapp.data.remote.model.response.Daily

enum class DailyParameter(val value: String) {
    WEATHER_CODE("weather_code"),
    TEMPERATURE_2M_MAX("temperature_2m_max"),
    TEMPERATURE_2M_MIN("temperature_2m_min"),
    APPARENT_TEMPERATURE_MAX("apparent_temperature_max"),
    APPARENT_TEMPERATURE_MIN("apparent_temperature_min"),
    SUNRISE("sunrise"),
    SUNSET("sunset"),
    DAYLIGHT_DURATION("daylight_duration"),
    SUNSHINE_DURATION("sunshine_duration"),
    UV_INDEX_MAX("uv_index_max"),
    UV_INDEX_CLEAR_SKY_MAX("uv_index_clear_sky_max"),
    PRECIPITATION_SUM("precipitation_sum"),
    RAIN_SUM("rain_sum"),
    SHOWERS_SUM("showers_sum"),
    SNOWFALL_SUM("snowfall_sum"),
    PRECIPITATION_HOURS("precipitation_hours"),
    PRECIPITATION_PROBABILITY_MAX("precipitation_probability_max"),
    WIND_SPEED_10M_MAX("wind_speed_10m_max"),
    WIND_GUSTS_10M_MAX("wind_gusts_10m_max"),
    WIND_DIRECTION_10M_DOMINANT("wind_direction_10m_dominant"),
    SHORTWAVE_RADIATION_SUM("shortwave_radiation_sum"),
    ET0_FAO_EVAPOTRANSPIRATION("et0_fao_evapotranspiration");

    companion object {
        val ALL : Array<DailyParameter> = DailyParameter.entries.toTypedArray()
    }
}