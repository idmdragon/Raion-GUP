package com.raionapp.githubuserprofile.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
val Username : String,
val Name : String,
val Location : String,
val Repository : String,
val Company : String,
val Followers : String,
val Following : String,
val Avatar : Int
):Parcelable