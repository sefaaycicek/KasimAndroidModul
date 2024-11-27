package com.example.example

import com.google.gson.annotations.SerializedName


data class Comments (

  @SerializedName("username" ) var username : String? = null,
  @SerializedName("text"     ) var text     : String? = null

)