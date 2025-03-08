package com.example.freeweatherapp.data.remote.util.builder.enums

enum class WeatherModel(val modelName: String) {
    AUTO("auto"),
    ARPAE_ARPAPCOSMO_5M("ARPAE ARPAPCOSMO 5m"),
    COSMO_2I("COSMO 2i"),
    BOM_ACCESS_G_0_15("BOM ACCESS-G 0.15°"),
    CMA_GFS_GRAPES_0_125("CMA GFS Grapes 0.125°"),
    CANADIAN_WEATHER_SERVICE_GDPS_0_125("Canadian Weather Service GDPS 0.125°"),
    CANADIAN_WEATHER_SERVICE_RDPS("Canadian Weather Service RDPS"),
    CANADIAN_WEATHER_SERVICE_HRDPS("Canadian Weather Service HRDPS"),
    DMI_HARMONIE_AROME_EUROPE("DMI Harmonie AROME Europe"),
    DWD_ICON("DWD ICON"),
    DWD_ICON_EU("DWD ICON-EU"),
    DWD_ICON_D2("DWD ICON-D2"),
    DWD_ICON_D2_15MIN("DWD ICON-D2 15min"),
    ECMWF_AIFS_0_25("ECMWF AIFS 0.25°"),
    ECMWF_AIFS_0_25_SINGLE("ECMWF AIFS 0.25° Single"),
    ECMWF_IFS_0_25("ECMWF IFS 0.25°"),
    JMA_GSM_0_5("JMA GSM 0.5°"),
    JMA_MSM_0_05("JMA MSM 0.05°"),
    KNMI_HARMONIE_AROME_EUROPE("KNMI Harmonie AROME Europe"),
    KNMI_HARMONIE_AROME_NETHERLANDS("KNMI Harmonie AROME Netherlands"),
    METEO_FRANCE_ARPEGE_WORLD_0_25("Météo-France ARPEGE World 0.25°"),
    METEO_FRANCE_ARPEGE_EUROPE_0_1("Météo-France ARPEGE Europe 0.1°"),
    METEO_FRANCE_ARPEGE_EUROPE_0_1_PROBABILITIES("Météo-France ARPEGE Europe 0.1° Probabilities"),
    METEO_FRANCE_AROME_FRANCE_0_01_HD("Météo-France AROME France 0.01 HD°"),
    METEO_FRANCE_AROME_FRANCE_0_01_HD_15MIN("Météo-France AROME France 0.01 HD 15min"),
    METEO_FRANCE_AROME_FRANCE_0_025("Météo-France AROME France 0.025°"),
    METEO_FRANCE_AROME_FRANCE_0_025_15MIN("Météo-France AROME France 0.025° 15min"),
    MET_NORWAY_MET_NORDIC_PP("MET Norway MET Nordic PP"),
    NOAA_NCEP_GFS_0_11("NOAA NCEP GFS 0.11°"),
    NOAA_NCEP_GFS_0_25("NOAA NCEP GFS 0.25°"),
    NOAA_NCEP_GFS_GRAPHCAST_0_25("NOAA NCEP GFS GraphCast 0.25°"),
    NOAA_NCEP_NBM_CONUS("NOAA NCEP NBM Conus"),
    NOAA_NCEP_HRRR_CONUS("NOAA NCEP HRRR Conus"),
    NOAA_NCEP_HRRR_CONUS_15MIN("NOAA NCEP HRRR Conus 15min"),
    UK_MET_OFFICE_UKMO_GLOBAL_DETERMINISTIC_0_09("UK Met Office UKMO Global Deterministic 0.09°"),
    UK_MET_OFFICE_UKMO_UKV("UK Met Office UKMO UKV");

    companion object {
        val ALL : Array<WeatherModel> = WeatherModel.entries.toTypedArray()
    }
}