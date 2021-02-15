package com.exercise.ministockbitapp.data.dto

import com.google.gson.annotations.SerializedName

data class CoinResponse<T>(
        @SerializedName("Message")
        val message: String,
        @SerializedName("Data")
        val result: List<T>
)