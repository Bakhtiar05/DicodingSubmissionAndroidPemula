package com.example.myappsubmission

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Food(
    val name: String,
    val description: String,
    val photo: Int,
    val price: String
) : Parcelable
