package com.exercise.ministockbitapp.data.dto

import com.google.gson.annotations.SerializedName

data class CoinRawPrice(
        @SerializedName("CHANGE24HOUR")
        val lastPrice24Hour: Integer,
        @SerializedName("CHANGEPCT24HOUR")
        val lastPrice24HourPct: Integer
)