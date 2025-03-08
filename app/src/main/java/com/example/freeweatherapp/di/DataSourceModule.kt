package com.example.freeweatherapp.di

import com.example.freeweatherapp.data.remote.datasource.abstraction.WeatherRemoteDataSource
import com.example.freeweatherapp.data.remote.datasource.implementation.WeatherRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun bindsWeatherRemoteDataSource(dataSource: WeatherRemoteDataSourceImpl): WeatherRemoteDataSource
}