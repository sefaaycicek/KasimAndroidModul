package com.example.example

import com.google.gson.annotations.SerializedName


data class Metadata (

  @SerializedName("id"           ) var id           : String?  = null,
  @SerializedName("private"      ) var private      : Boolean? = null,
  @SerializedName("createdAt"    ) var createdAt    : String?  = null,
  @SerializedName("collectionId" ) var collectionId : String?  = null,
  @SerializedName("name"         ) var name         : String?  = null

)