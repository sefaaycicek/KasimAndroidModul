package com.sirketismi.accounts.api

import com.example.example.PostData
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {

    @GET("6718c2a4acd3cb34a89ba7c4")
    suspend fun getPosts() : PostData?
}