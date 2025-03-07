package com.example.freeweatherapp.data.remote.util.builder.ext

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun LocalDate.toUrlFormat(): String {
    return this.format(DateTimeFormatter.ISO_LOCAL_DATE)
}

fun LocalDateTime.toUrlFormat(): String {
    return this.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm"))
}