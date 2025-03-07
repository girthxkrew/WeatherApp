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
import org.junit.Assert.*

import org.junit.Test
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.TimeZone

class HttpRequestBuilderTest {

    @Test
    fun `add Location success`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0"
        assertEquals(request, expectedResult)
    }

    @Test
    fun `add Locations success`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1).addLocation(
            Coordinate(latitude = 53.53, longitude = 9.0),
            Coordinate(latitude = -69.0, longitude = -9.0)
        ).build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53,-69.0&${QueryParameters.LONGITUDE}=9.0,-9.0"
        assertEquals(request, expectedResult)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `add location failed`() {
        HttpRequestBuilder.builder(ApiVersion.V1).build()
    }

    @Test
    fun `add past days success`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .pastDays(1)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.PAST_DAYS}=1"
        assertEquals(request, expectedResult)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `add past days failed less than 1`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .pastDays(-1)
            .build()
    }

    @Test(expected = IllegalArgumentException::class)
    fun `add past days failed greater than 92`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .pastDays(93)
            .build()
    }

    @Test
    fun `add forecast days success`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .forecastDays(1)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.FORECAST_DAYS}=1"
        assertEquals(request, expectedResult)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `add forecast days failed less than 1`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .forecastDays(-1)
            .build()
    }

    @Test(expected = IllegalArgumentException::class)
    fun `add forecast days failed greater than 92`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .forecastDays(17)
            .build()
    }

    @Test
    fun `add forecast hours success`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .forecastHours(1)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.FORECAST_HOURS}=1"
        assertEquals(request, expectedResult)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `add forecast hours failed less than 1`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .forecastHours(-1)
            .build()
    }

    @Test
    fun `add forecast 15 minutes success`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .forecastMinutely15(1)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.FORECAST_MINUTELY_15}=1"
        assertEquals(request, expectedResult)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `add forecast 15 minutes failed less than 1`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .forecastMinutely15(-1)
            .build()
    }

    @Test
    fun `add past hours success`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .pastHours(1)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.PAST_HOURS}=1"
        assertEquals(request, expectedResult)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `add past hours failed less than 1`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .pastHours(-1)
            .build()
    }

    @Test
    fun `add past 15 minutes success`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .pastMinutely15(1)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.PAST_MINUTELY_15}=1"
        assertEquals(request, expectedResult)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `add past 15 minutes failed less than 1`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .pastMinutely15(-1)
            .build()
    }

    @Test
    fun `add current parameter`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .current(CurrentParameter.TEMPERATURE_2M)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.CURRENT}=${CurrentParameter.TEMPERATURE_2M.value}"
        assertEquals(request, expectedResult)
    }

    @Test
    fun `add all current parameters`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .current(*CurrentParameter.entries.toTypedArray())
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.CURRENT}=${CurrentParameter.entries.joinToString(",") { it.value }}"
        assertEquals(request, expectedResult)
    }

    @Test
    fun `add hourly parameter`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .hourly(HourlyParameter.RAIN)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.HOURLY}=${HourlyParameter.RAIN.value}"
        assertEquals(request, expectedResult)
    }

    @Test
    fun `add all hourly parameters`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .hourly(*HourlyParameter.entries.toTypedArray())
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.HOURLY}=${HourlyParameter.entries.joinToString(",") { it.value }}"
        assertEquals(request, expectedResult)
    }


    @Test
    fun `add daily parameter`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .daily(DailyParameter.DAYLIGHT_DURATION)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.DAILY}=${DailyParameter.DAYLIGHT_DURATION.value}"
        assertEquals(request, expectedResult)
    }

    @Test
    fun `add all daily parameters`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .daily(*DailyParameter.entries.toTypedArray())
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.DAILY}=${DailyParameter.entries.joinToString(",") { it.value }}"
        assertEquals(request, expectedResult)
    }

    @Test
    fun `add minutely 15 parameter`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .minutely15(Minutely15Parameter.RAIN)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.MINUTELY_15}=${Minutely15Parameter.RAIN.value}"
        assertEquals(request, expectedResult)
    }

    @Test
    fun `add all minutely 15 parameters`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .minutely15(*Minutely15Parameter.entries.toTypedArray())
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.MINUTELY_15}=${Minutely15Parameter.entries.joinToString(",") { it.value }}"
        assertEquals(request, expectedResult)
    }

    @Test
    fun `add model parameter`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .models(WeatherModel.AUTO)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.MODELS}=${WeatherModel.AUTO.modelName}"
        assertEquals(request, expectedResult)
    }

    @Test
    fun `add all models parameters`() {
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .models(*WeatherModel.entries.toTypedArray())
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.MODELS}=${WeatherModel.entries.joinToString(",") { it.modelName }}"
        assertEquals(request, expectedResult)
    }

    @Test
    fun `add timezone parameter`() {
        val timezone = TimeZone.getTimeZone("Europe/Berlin")
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .timezone(timezone)
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53&${QueryParameters.LONGITUDE}=9.0&${QueryParameters.TIMEZONE}=${timezone.id}"
        assertEquals(request, expectedResult)
    }

    @Test
    fun `add timezone parameters`() {
        val timezones = listOf(TimeZone.getTimeZone("Europe/Berlin"), TimeZone.getTimeZone("America/New_York"))
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(
                Coordinate(latitude = 53.53, longitude = 9.0),
                Coordinate(latitude = -69.0, longitude = -9.0)
            )
            .timezone(timezones.first(), timezones.last())
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53,-69.0&${QueryParameters.LONGITUDE}=9.0,-9.0&${QueryParameters.TIMEZONE}=${
            timezones.joinToString(
                ","
            ) { it.id }
        }"
        assertEquals(request, expectedResult)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `add timezone parameters failed`() {
        val timezones = listOf(TimeZone.getTimeZone("Europe/Berlin"), TimeZone.getTimeZone("America/New_York"))
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = -69.0, longitude = -9.0))
            .timezone(timezones.first(), timezones.last())
            .build()
    }

    @Test
    fun `add all optional fields that aren't lists`() {
        val date = LocalDate.now(TimeZone.getTimeZone("Europe/Berlin").toZoneId())
        val dateTime = LocalDateTime.now()
        val request = HttpRequestBuilder.builder(apiVersion = ApiVersion.V1)
            .addLocation(Coordinate(latitude = 53.53, longitude = 9.0))
            .elevation(0.1)
            .temperatureUnit(TemperatureUnit.FAHRENHEIT)
            .windSpeedUnit(WindSpeedUnit.KMH)
            .precipitationUnit(PrecipitationUnit.INCH)
            .timeFormat(TimeFormat.UNIXTIME)
            .forecastDays(1)
            .forecastHours(1)
            .forecastMinutely15(1)
            .pastDays(1)
            .pastHours(1)
            .pastMinutely15(1)
            .startDate(date)
            .endDate(date)
            .startHour(dateTime)
            .startMinutely15String(dateTime)
            .endHour(dateTime)
            .endMinutely15String(dateTime)
            .cellSelection(CellSelection.SEA)
            .apiKey("1")
            .build()

        val expectedResult = "${ApiVersion.V1.baseUrl}?${QueryParameters.LATITUDE}=53.53" +
                "&${QueryParameters.LONGITUDE}=9.0" +
                "&${QueryParameters.ELEVATION}=0.1" +
                "&${QueryParameters.TEMPERATURE_UNIT}=${TemperatureUnit.FAHRENHEIT.value}" +
                "&${QueryParameters.WIND_SPEED_UNIT}=${WindSpeedUnit.KMH.value}" +
                "&${QueryParameters.PRECIPITATION_UNIT}=${PrecipitationUnit.INCH.value}" +
                "&${QueryParameters.TIME_FORMAT}=${TimeFormat.UNIXTIME.value}" +
                "&${QueryParameters.FORECAST_DAYS}=1" +
                "&${QueryParameters.FORECAST_HOURS}=1" +
                "&${QueryParameters.FORECAST_MINUTELY_15}=1" +
                "&${QueryParameters.PAST_DAYS}=1" +
                "&${QueryParameters.PAST_HOURS}=1" +
                "&${QueryParameters.PAST_MINUTELY_15}=1" +
                "&${QueryParameters.START_DATE}=${date.toUrlFormat()}" +
                "&${QueryParameters.END_DATE}=${date.toUrlFormat()}" +
                "&${QueryParameters.START_HOUR}=${dateTime.toUrlFormat()}" +
                "&${QueryParameters.START_MINUTELY_15_STRING}=${dateTime.toUrlFormat()}" +
                "&${QueryParameters.END_HOUR}=${dateTime.toUrlFormat()}" +
                "&${QueryParameters.END_MINUTELY_15_STRING}=${dateTime.toUrlFormat()}" +
                "&${QueryParameters.CELL_SELECTION}=${CellSelection.SEA.value}" +
                "&${QueryParameters.API_KEY}=1" +
                ""

        val split1 = request.split("?")
        val set1 = split1[0].split("&").toSet()
        val split2 = expectedResult.split("?")
        val set2 = split2[0].split("&").toSet()

        assertEquals(set1, set2)
    }
}