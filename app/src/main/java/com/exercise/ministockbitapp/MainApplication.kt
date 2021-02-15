package com.exercise.ministockbitapp

import android.app.Application
import com.exercise.ministockbitapp.di.networkModule
import com.exercise.ministockbitapp.di.repositoryModule
import com.exercise.ministockbitapp.di.serviceModule
import com.exercise.ministockbitapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(listOf(
                networkModule,
                serviceModule,
                repositoryModule,
                viewModelModule
            ))
        }
    }
}