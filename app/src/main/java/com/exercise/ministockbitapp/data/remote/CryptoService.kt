package com.exercise.ministockbitapp.data.remote

import com.exercise.ministockbitapp.data.dto.Coin
import com.exercise.ministockbitapp.data.dto.CoinResponse
import retrofit2.Call
import retrofit2.http.GET

interface CryptoService {
    @GET("top/totaltoptiervolfull?limit=50&tsym=USD")
    fun findAllWatchlist() : Call<CoinResponse<Coin>>
}