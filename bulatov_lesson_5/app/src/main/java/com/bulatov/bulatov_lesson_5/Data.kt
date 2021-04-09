package com.bulatov.bulatov_lesson_5

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
  var string : String
  ) : Parcelable