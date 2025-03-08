package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyUnitsGeopotentialHeightHpa(
    @SerialName("geopotential_height_1000hPa")
    val geopotentialHeight1000hPa: String ?= null,
    @SerialName("geopotential_height_975hPa")
    val geopotentialHeight975hPa: String ?= null,
    @SerialName("geopotential_height_950hPa")
    val geopotentialHeight950hPa: String ?= null,
    @SerialName("geopotential_height_925hPa")
    val geopotentialHeight925hPa: String ?= null,
    @SerialName("geopotential_height_900hPa")
    val geopotentialHeight900hPa: String ?= null,
    @SerialName("geopotential_height_850hPa")
    val geopotentialHeight850hPa: String ?= null,
    @SerialName("geopotential_height_800hPa")
    val geopotentialHeight800hPa: String ?= null,
    @SerialName("geopotential_height_700hPa")
    val geopotentialHeight700hPa: String ?= null,
    @SerialName("geopotential_height_600hPa")
    val geopotentialHeight600hPa: String ?= null,
    @SerialName("geopotential_height_500hPa")
    val geopotentialHeight500hPa: String ?= null,
    @SerialName("geopotential_height_400hPa")
    val geopotentialHeight400hPa: String ?= null,
    @SerialName("geopotential_height_300hPa")
    val geopotentialHeight300hPa: String ?= null,
    @SerialName("geopotential_height_250hPa")
    val geopotentialHeight250hPa: String ?= null,
    @SerialName("geopotential_height_200hPa")
    val geopotentialHeight200hPa: String ?= null,
    @SerialName("geopotential_height_150hPa")
    val geopotentialHeight150hPa: String ?= null,
    @SerialName("geopotential_height_100hPa")
    val geopotentialHeight100hPa: String ?= null,
    @SerialName("geopotential_height_70hPa")
    val geopotentialHeight70hPa: String ?= null,
    @SerialName("geopotential_height_50hPa")
    val geopotentialHeight50hPa: String ?= null,
    @SerialName("geopotential_height_30hPa")
    val geopotentialHeight30hPa: String ?= null
)
