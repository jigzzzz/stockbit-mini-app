package com.exercise.ministockbitapp.data.dto

import com.google.gson.annotations.SerializedName

data class CoinDisplayPrice(
        @SerializedName("PRICE")
        val currentPrice: String,
        @SerializedName("CHANGE24HOUR")
        val lastPrice24Hour: String,
        @SerializedName("CHANGEPCT24HOUR")
        val lastPrice24HourPct: String
)