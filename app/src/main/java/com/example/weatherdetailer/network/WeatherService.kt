package com.example.weatherdetailer.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    @GET("data/2.5/weather?")
    fun getCurrentWeatherData(@Query("lat") lat:String, @Query("lon") lon:String,@Query("APPID") app_id:String,@Query("units") unit:String): Call<WeatherResponse>
    @GET("data/2.5/forecast?")
    fun getForecast(@Query("lat") lat:String, @Query("lon") lon:String, @Query("APPID") app_id:String, @Query("units") unit:String): Call<MonthlyResponse>
  //  @GET("data/2.5/forecast?")
//    fun getForecast(@Query("lat") q:String,@Query("APPID") app_id:String,@Query("units") unit:String):Call<MonthlyResponse>

    @GET("data/2.5/onecall/timemachine?")
    fun getPastData(@Query("lat") lat:String,@Query("lon") lon:String,@Query("dt") dt:String,@Query("APPID") app_id:String,@Query("units") unit:String):Call<PastResponse>
}