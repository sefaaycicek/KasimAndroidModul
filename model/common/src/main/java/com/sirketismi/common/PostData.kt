package com.example.example

import com.google.gson.annotations.SerializedName


data class PostData (

  @SerializedName("record"   ) var record   : ArrayList<Record> = arrayListOf(),
  @SerializedName("metadata" ) var metadata : Metadata?         = Metadata()

)