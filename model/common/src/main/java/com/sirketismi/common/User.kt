package com.example.example

import com.google.gson.annotations.SerializedName


data class User (

  @SerializedName("username"        ) var username       : String? = null,
  @SerializedName("profile_picture" ) var profilePicture : String? = null

)