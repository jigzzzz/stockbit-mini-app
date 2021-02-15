package com.exercise.ministockbitapp.data.model

import com.exercise.ministockbitapp.data.dto.Coin as CoinDTO
import com.exercise.ministockbitapp.data.model.Coin

data class Coin(
        val name: String,
        val fullName: String,
        val currentPrice: String,
        val changingPrice: String,
        val isPriceUp: Boolean
) {
    companion object {
        fun convertFromResponse(coins: List<CoinDTO>) : List<Coin> {
            return coins.map {
                val isPriceUp = it.coinRawPrice.detail.lastPrice24Hour < 0
                Coin(
                    it.coinInfo.name,
                    it.coinInfo.fullname,
                    it.coinDisplayPrice.detail.currentPrice,
                    "${it.coinDisplayPrice.detail.lastPrice24Hour}(${it.coinDisplayPrice.detail.lastPrice24HourPct})",
                    isPriceUp
                )
            }
        }
    }
}