package com.exercise.ministockbitapp.data.dto

import com.google.gson.annotations.SerializedName

data class Currency<T>(
    @SerializedName("USD")
    val detail : T
)