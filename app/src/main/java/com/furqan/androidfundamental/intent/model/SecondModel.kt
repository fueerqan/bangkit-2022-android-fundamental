package com.furqan.androidfundamental.intent.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SecondModel(
    val title: String,
    val subtitle: String,
    val description: String
) : Parcelable