package com.exercise.ministockbitapp.data.dto

import com.google.gson.annotations.SerializedName

data class Coin(
        @SerializedName("CoinInfo")
        val coinInfo: CoinInfo,
        @SerializedName("RAW")
        val coinRawPrice: CoinRawPrice,
        @SerializedName("DISPLAY")
        val coinDisplayPrice: CoinDisplayPrice
)