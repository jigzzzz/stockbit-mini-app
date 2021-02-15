package com.exercise.ministockbitapp.di

import com.exercise.ministockbitapp.ui.watchlist.WatchlistViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { WatchlistViewModel(get()) }
}