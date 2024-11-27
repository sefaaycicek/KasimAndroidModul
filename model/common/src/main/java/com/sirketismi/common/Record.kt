package com.example.example

import com.google.gson.annotations.SerializedName


data class Record (

  @SerializedName("id"        ) var id        : Int?                = null,
  @SerializedName("user"      ) var user      : User?               = User(),
  @SerializedName("image_url" ) var imageUrl  : String?             = null,
  @SerializedName("caption"   ) var caption   : String?             = null,
  @SerializedName("likes"     ) var likes     : Int?                = null,
  @SerializedName("comments"  ) var comments  : ArrayList<Comments> = arrayListOf(),
  @SerializedName("timestamp" ) var timestamp : String?             = null

)