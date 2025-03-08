package com.example.freeweatherapp.data.remote.mapper

import com.example.freeweatherapp.data.remote.model.request.Location
import com.example.freeweatherapp.data.remote.util.builder.model.Coordinate

fun Location.toCoordinate(): Coordinate {
    return Coordinate(
        latitude = this.latitude,
        longitude = this.longitude
    )
}