package com.example.freeweatherapp.data.remote.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyCloudCoverHpa(
    @SerialName("cloud_cover_1000hPa")
    val cloudCover1000hPa: List<Int> ?= null,
    @SerialName("cloud_cover_975hPa")
    val cloudCover975hPa: List<Int> ?= null,
    @SerialName("cloud_cover_950hPa")
    val cloudCover950hPa: List<Int> ?= null,
    @SerialName("cloud_cover_925hPa")
    val cloudCover925hPa: List<Int> ?= null,
    @SerialName("cloud_cover_900hPa")
    val cloudCover900hPa: List<Int> ?= null,
    @SerialName("cloud_cover_850hPa")
    val cloudCover850hPa: List<Int> ?= null,
    @SerialName("cloud_cover_800hPa")
    val cloudCover800hPa: List<Int> ?= null,
    @SerialName("cloud_cover_700hPa")
    val cloudCover700hPa: List<Int> ?= null,
    @SerialName("cloud_cover_600hPa")
    val cloudCover600hPa: List<Int> ?= null,
    @SerialName("cloud_cover_500hPa")
    val cloudCover500hPa: List<Int> ?= null,
    @SerialName("cloud_cover_400hPa")
    val cloudCover400hPa: List<Int> ?= null,
    @SerialName("cloud_cover_300hPa")
    val cloudCover300hPa: List<Int> ?= null,
    @SerialName("cloud_cover_250hPa")
    val cloudCover250hPa: List<Int> ?= null,
    @SerialName("cloud_cover_200hPa")
    val cloudCover200hPa: List<Int> ?= null,
    @SerialName("cloud_cover_150hPa")
    val cloudCover150hPa: List<Int> ?= null,
    @SerialName("cloud_cover_100hPa")
    val cloudCover100hPa: List<Int> ?= null,
    @SerialName("cloud_cover_70hPa")
    val cloudCover70hPa: List<Int> ?= null,
    @SerialName("cloud_cover_50hPa")
    val cloudCover50hPa: List<Int> ?= null,
    @SerialName("cloud_cover_30hPa")
    val cloudCover30hPa: List<Int> ?= null
)
