package com.exercise.ministockbitapp.ui.watchlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.exercise.ministockbitapp.data.model.Coin
import com.exercise.ministockbitapp.data.repository.CryptoRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class WatchlistViewModel(private val repo: CryptoRepository) : ViewModel() {
    private val _watchlist = repo.findAllWatchlist()
    val watchlist: LiveData<List<Coin>> get() = _watchlist
}