package com.exercise.ministockbitapp.data.model

import com.exercise.ministockbitapp.data.dto.Coin as CoinDTO
import com.exercise.ministockbitapp.data.model.Coin

data class Coin(
        val name: String,
        val fullname: String,
        val currentPrice: String,
        val changingPrice: String,
        val isPriceUp: Boolean
) {
    companion object {
        fun convertFromResponse(coins: List<CoinDTO>) : List<Coin> {

            return coins.map {
                Coin(
                    it.coinInfo.name,
                    it.coinInfo.fullname,
                    it.coinDisplayPrice.currentPrice,
                    "${it.coinDisplayPrice.lastPrice24Hour}",
                    it.coinRawPrice.lastPrice24HourPct < 0
                )
            }
        }
    }
}