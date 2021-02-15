package com.exercise.ministockbitapp.data.repository
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.exercise.ministockbitapp.data.dto.CoinResponse
import com.exercise.ministockbitapp.data.model.Coin
import com.exercise.ministockbitapp.data.remote.CryptoService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.exercise.ministockbitapp.data.dto.Coin as CoinDTO

class CryptoRepository(private val api: CryptoService) {

    fun findAllWatchlist() : LiveData<List<CoinDTO>> {
        val watchlist: MutableLiveData<List<CoinDTO>> = MutableLiveData()
        api.findAllWatchlist().enqueue(
            object : Callback<CoinResponse<CoinDTO>> {
                override fun onFailure(
                    call: Call<CoinResponse<com.exercise.ministockbitapp.data.dto.Coin>>,
                    t: Throwable
                ) {
                    t.stackTrace
                }

                override fun onResponse(
                    call: Call<CoinResponse<com.exercise.ministockbitapp.data.dto.Coin>>,
                    response: Response<CoinResponse<com.exercise.ministockbitapp.data.dto.Coin>>
                ) {
                    if(response.isSuccessful) {
                        watchlist.postValue(response.body()!!.result)
                    }
                }
            }
        )
        return watchlist
    }

}