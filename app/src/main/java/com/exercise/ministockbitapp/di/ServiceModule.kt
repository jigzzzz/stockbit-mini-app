package com.exercise.ministockbitapp.di

import com.exercise.ministockbitapp.data.remote.CryptoService
import org.koin.dsl.module
import retrofit2.Retrofit

val serviceModule = module {
    fun provideCryptoService(retrofit: Retrofit) : CryptoService = retrofit.create(CryptoService::class.java)
    single { provideCryptoService(get()) }
}