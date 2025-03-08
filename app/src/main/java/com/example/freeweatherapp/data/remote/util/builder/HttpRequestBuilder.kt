package com.example.freeweatherapp.data.remote.util.builder

import com.example.freeweatherapp.data.remote.util.builder.enums.ApiVersion
import com.example.freeweatherapp.data.remote.util.builder.enums.CellSelection
import com.example.freeweatherapp.data.remote.util.builder.enums.CurrentParameter
import com.example.freeweatherapp.data.remote.util.builder.enums.DailyParameter
import com.example.freeweatherapp.data.remote.util.builder.enums.HourlyParameter
import com.example.freeweatherapp.data.remote.util.builder.enums.Minutely15Parameter
import com.example.freeweatherapp.data.remote.util.builder.enums.PrecipitationUnit
import com.example.freeweatherapp.data.remote.util.builder.enums.TemperatureUnit
import com.example.freeweatherapp.data.remote.util.builder.enums.TimeFormat
import com.example.freeweatherapp.data.remote.util.builder.enums.WeatherModel
import com.example.freeweatherapp.data.remote.util.builder.enums.WindSpeedUnit
import com.example.freeweatherapp.data.remote.util.builder.ext.toUrlFormat
import com.example.freeweatherapp.data.remote.util.builder.model.Coordinate
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.TimeZone

class HttpRequestBuilder private constructor(private val apiVersion: ApiVersion) {
    private val latitude = mutableListOf<Double>()
    private val longitude = mutableListOf<Double>()
    private var elevation = mutableListOf<Double>()
    private val current = mutableListOf<String>()
    private val hourly = mutableListOf<String>()
    private val daily = mutableListOf<String>()
    private val fifteenMinuteInterval = mutableListOf<String>()
    private var temperatureUnit: TemperatureUnit? = null
    private var windSpeedUnit: WindSpeedUnit? = null
    private var precipitationUnit: PrecipitationUnit? = null
    private var timeFormat: TimeFormat? = null
    private var timezone = mutableListOf<String>()
    private var pastDays: Int? = null
    private var forecastDays: Int? = null
    private var forecastHours: Int? = null
    private var forecastMinutely15: Int? = null
    private var pastHours: Int? = null
    private var pastMinutely15: Int? = null
    private var startDate: String? = null
    private var endDate: String? = null
    private var startHour: String? = null
    private var endHour: String? = null
    private var startMinutely15String: String? = null
    private var endMinutely15String: String? = null
    private var models = mutableListOf<String>()
    private var cellSelection: CellSelection? = null
    private var apiKey: String? = null

    companion object {
        fun builder(apiVersion: ApiVersion = ApiVersion.V1) = HttpRequestBuilder(apiVersion)
    }

    fun addCoordinate(vararg parameters: Coordinate) = apply {
        parameters.forEach { coordinate ->
            latitude.add(coordinate.latitude)
            longitude.add(coordinate.longitude)
        }
    }

    fun elevation(vararg parameters: Double) = apply { this.elevation.addAll(parameters.toList()) }
    fun timezone(vararg timezone: TimeZone) = apply { this.timezone.addAll(timezone.map { it.id }) }
    fun current(vararg parameters: CurrentParameter) = apply { this.current.addAll(parameters.map { it.value }) }
    fun hourly(vararg parameters: HourlyParameter) = apply { this.hourly.addAll(parameters.map { it.value }) }
    fun daily(vararg parameters: DailyParameter) = apply { this.daily.addAll(parameters.map { it.value }) }
    fun minutely15(vararg parameters: Minutely15Parameter) = apply { this.fifteenMinuteInterval.addAll(parameters.map { it.value }) }
    fun temperatureUnit(unit: TemperatureUnit) = apply { this.temperatureUnit = unit }
    fun windSpeedUnit(unit: WindSpeedUnit) = apply { this.windSpeedUnit = unit }
    fun precipitationUnit(unit: PrecipitationUnit) = apply { this.precipitationUnit = unit }
    fun timeFormat(format: TimeFormat) = apply { this.timeFormat = format }
    fun pastDays(days: Int) = apply {
        require(days in 0..92) { "past_days must be between 0 and 92." }
        this.pastDays = days
    }

    fun forecastDays(days: Int) = apply {
        require(days in 0..16) { "forecast_days must be between 0 and 16." }
        this.forecastDays = days
    }

    fun forecastHours(hours: Int) = apply {
        require(hours > 0) { "forecast_hours must be greater than 0." }
        this.forecastHours = hours
    }

    fun forecastMinutely15(minutes: Int) = apply {
        require(minutes > 0) { "forecast_minutely_15 must be greater than 0." }
        this.forecastMinutely15 = minutes
    }

    fun pastHours(hours: Int) = apply {
        require(hours > 0) { "past_hours must be greater than 0." }
        this.pastHours = hours
    }

    fun pastMinutely15(minutes: Int) = apply {
        require(minutes > 0) { "past_minutely_15 must be greater than 0." }
        this.pastMinutely15 = minutes
    }

    fun startDate(date: LocalDate) = apply {
        this.startDate = date.toUrlFormat()
    }

    fun endDate(date: LocalDate) = apply {
        this.endDate = date.toUrlFormat()
    }

    fun startHour(dateTime: LocalDateTime) = apply {
        this.startHour = dateTime.toUrlFormat()
    }

    fun endHour(dateTime: LocalDateTime) = apply {
        this.endHour = dateTime.toUrlFormat()
    }

    fun startMinutely15String(dateTime: LocalDateTime) = apply {
        this.startMinutely15String = dateTime.toUrlFormat()
    }

    fun endMinutely15String(dateTime: LocalDateTime) = apply {
        this.endMinutely15String = dateTime.toUrlFormat()
    }

    fun models(vararg parameters: WeatherModel) = apply { this.models.addAll(parameters.map { it.modelName }) }
    fun cellSelection(selection: CellSelection) = apply { this.cellSelection = selection }
    fun apiKey(key: String) = apply { this.apiKey = key }

    fun build(): String {
        require(latitude.isNotEmpty() && longitude.isNotEmpty()) { "At least one location must be set" }
        require(latitude.size >= timezone.size && longitude.size >= timezone.size) { "Longitude, Latitude, Timezone sizes must be the same number" }
        require(latitude.size >= elevation.size && longitude.size >= elevation.size) { "Longitude, Latitude, Elevation sizes must be the same number" }
        val params = StringBuilder()
            .append("${apiVersion.baseUrl}?")
            .append("${QueryParameters.LATITUDE}=${latitude.joinToString(",")}&")
            .append("${QueryParameters.LONGITUDE}=${longitude.joinToString(",")}")

        if (elevation.isNotEmpty()) params.append("&${QueryParameters.ELEVATION}=${elevation.joinToString(",")}")
        if (timezone.isNotEmpty()) params.append(
            "&${QueryParameters.TIMEZONE}=${
                timezone.joinToString(
                    ","
                )
            }"
        )
        if (current.isNotEmpty()) params.append(
            "&${QueryParameters.CURRENT}=${
                current.joinToString(
                    ","
                )
            }"
        )
        if (hourly.isNotEmpty()) params.append("&${QueryParameters.HOURLY}=${hourly.joinToString(",")}")
        if (daily.isNotEmpty()) params.append("&${QueryParameters.DAILY}=${daily.joinToString(",")}")
        if (fifteenMinuteInterval.isNotEmpty()) params.append(
            "&${QueryParameters.MINUTELY_15}=${
                fifteenMinuteInterval.joinToString(
                    ","
                )
            }"
        )

        temperatureUnit?.let { params.append("&${QueryParameters.TEMPERATURE_UNIT}=${it.value}") }
        windSpeedUnit?.let { params.append("&${QueryParameters.WIND_SPEED_UNIT}=${it.value}") }
        precipitationUnit?.let { params.append("&${QueryParameters.PRECIPITATION_UNIT}=${it.value}") }
        timeFormat?.let { params.append("&${QueryParameters.TIME_FORMAT}=${it.value}") }
        pastDays?.let { params.append("&${QueryParameters.PAST_DAYS}=$it") }
        forecastDays?.let { params.append("&${QueryParameters.FORECAST_DAYS}=$it") }
        forecastHours?.let { params.append("&${QueryParameters.FORECAST_HOURS}=$it") }
        forecastMinutely15?.let { params.append("&${QueryParameters.FORECAST_MINUTELY_15}=$it") }
        pastHours?.let { params.append("&${QueryParameters.PAST_HOURS}=$it") }
        pastMinutely15?.let { params.append("&${QueryParameters.PAST_MINUTELY_15}=$it") }
        startDate?.let { params.append("&${QueryParameters.START_DATE}=$it") }
        endDate?.let { params.append("&${QueryParameters.END_DATE}=$it") }
        startHour?.let { params.append("&${QueryParameters.START_HOUR}=$it") }
        endHour?.let { params.append("&${QueryParameters.END_HOUR}=$it") }
        startMinutely15String?.let { params.append("&${QueryParameters.START_MINUTELY_15_STRING}=$it") }
        endMinutely15String?.let { params.append("&${QueryParameters.END_MINUTELY_15_STRING}=$it") }
        if (models.isNotEmpty()) params.append("&${QueryParameters.MODELS}=${models.joinToString(",")}")
        cellSelection?.let { params.append("&${QueryParameters.CELL_SELECTION}=${it.value}") }
        apiKey?.let { params.append("&${QueryParameters.API_KEY}=$it") }

        return params.toString()
    }
}