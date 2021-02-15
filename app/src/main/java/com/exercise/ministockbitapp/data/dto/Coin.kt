package com.exercise.ministockbitapp.data.dto

import com.google.gson.annotations.SerializedName

data class Coin(
        @SerializedName("CoinInfo")
        val coinInfo: CoinInfo,
        @SerializedName("RAW")
        val coinRawPrice: Currency<CoinRawPrice>,
        @SerializedName("DISPLAY")
        val coinDisplayPrice: Currency<CoinDisplayPrice>
)