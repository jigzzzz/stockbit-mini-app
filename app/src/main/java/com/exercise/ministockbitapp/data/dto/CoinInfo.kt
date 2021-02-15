package com.exercise.ministockbitapp.data.dto

import com.google.gson.annotations.SerializedName

data class CoinInfo (
        @SerializedName("Name")
        val name: String,
        @SerializedName("Fullname")
        val fullname: String
)