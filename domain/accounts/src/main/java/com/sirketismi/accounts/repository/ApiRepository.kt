package com.sirketismi.accounts.repository

import com.example.example.PostData
import com.sirketismi.accounts.api.ApiService
import javax.inject.Inject

interface IApiRepository {
    suspend fun getPosts() : PostData?
}

class ApiRepository @Inject constructor(val apiService : ApiService) : IApiRepository {
    override suspend fun getPosts(): PostData? {
        return apiService.getPosts()
    }
}