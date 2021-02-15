package com.exercise.ministockbitapp.di

import com.exercise.ministockbitapp.data.repository.CryptoRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<CryptoRepository> { CryptoRepository(get()) }
}