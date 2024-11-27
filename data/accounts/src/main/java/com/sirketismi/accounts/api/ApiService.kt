package com.sirketismi.accounts.api

import com.example.example.PostData
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {

    @GET("6718c2a4acd3cb34a89ba7c4")
    @Headers("X-Master-Key:\$2a\$10\$pdFFYaojHu20ZOe2lplN5OAkWMKg4hCS/9SHMRPtdIyNsHQHDJ6fO",
        "X-Access-Key:\$2a\$10\$8BtiVaCOddlvEKbeJGuj7.sz2xG9rIilDCDR5EY3LLN1Rt7RumMXC")
    suspend fun getPosts() : PostData?
}