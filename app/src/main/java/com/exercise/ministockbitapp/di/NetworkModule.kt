package com.exercise.ministockbitapp.di

import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    fun provideOkHttp() = OkHttpClient.Builder()
        .readTimeout(15, TimeUnit.SECONDS)
        .connectTimeout(15, TimeUnit.SECONDS)
        .build()
    fun provideGson() = GsonConverterFactory.create()
    fun provideRetrofit(gson: GsonConverterFactory, client: OkHttpClient) = Retrofit.Builder()
        .baseUrl("")
        .addConverterFactory(gson)
        .client(client)
        .build()
    single { provideOkHttp() }
    single { provideGson() }
    single { provideRetrofit(get(), get()) }
}