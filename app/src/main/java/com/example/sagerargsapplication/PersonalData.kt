package com.example.sagerargsapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonalData(
    val username: String = "",
    val userEmail: String =""
): Parcelable
