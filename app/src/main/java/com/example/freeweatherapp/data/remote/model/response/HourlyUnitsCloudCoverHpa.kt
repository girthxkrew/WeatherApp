package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyUnitsCloudCoverHpa(
    @SerialName("cloud_cover_1000hPa")
    val cloudCover1000hPa: String ?= null,
    @SerialName("cloud_cover_975hPa")
    val cloudCover975hPa: String ?= null,
    @SerialName("cloud_cover_950hPa")
    val cloudCover950hPa: String ?= null,
    @SerialName("cloud_cover_925hPa")
    val cloudCover925hPa: String ?= null,
    @SerialName("cloud_cover_900hPa")
    val cloudCover900hPa: String ?= null,
    @SerialName("cloud_cover_850hPa")
    val cloudCover850hPa: String ?= null,
    @SerialName("cloud_cover_800hPa")
    val cloudCover800hPa: String ?= null,
    @SerialName("cloud_cover_700hPa")
    val cloudCover700hPa: String ?= null,
    @SerialName("cloud_cover_600hPa")
    val cloudCover600hPa: String ?= null,
    @SerialName("cloud_cover_500hPa")
    val cloudCover500hPa: String ?= null,
    @SerialName("cloud_cover_400hPa")
    val cloudCover400hPa: String ?= null,
    @SerialName("cloud_cover_300hPa")
    val cloudCover300hPa: String ?= null,
    @SerialName("cloud_cover_250hPa")
    val cloudCover250hPa: String ?= null,
    @SerialName("cloud_cover_200hPa")
    val cloudCover200hPa: String ?= null,
    @SerialName("cloud_cover_150hPa")
    val cloudCover150hPa: String ?= null,
    @SerialName("cloud_cover_100hPa")
    val cloudCover100hPa: String ?= null,
    @SerialName("cloud_cover_70hPa")
    val cloudCover70hPa: String ?= null,
    @SerialName("cloud_cover_50hPa")
    val cloudCover50hPa: String ?= null,
    @SerialName("cloud_cover_30hPa")
    val cloudCover30hPa: String ?= null
)
