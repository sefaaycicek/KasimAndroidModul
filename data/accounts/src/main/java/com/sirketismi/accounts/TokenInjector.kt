package com.sirketismi.accounts

import okhttp3.Interceptor
import okhttp3.Response
import retrofit2.http.Headers
import javax.inject.Inject

class TokenInjector @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val authRequest = originalRequest.newBuilder().method(originalRequest.method, originalRequest.body)

        authRequest.addHeader("X-Master-Key", "\$2a\$10\$pdFFYaojHu20ZOe2lplN5OAkWMKg4hCS/9SHMRPtdIyNsHQHDJ6fO")
        authRequest.addHeader("X-Access-Key", "\\\$2a\\\$10\\\$8BtiVaCOddlvEKbeJGuj7.sz2xG9rIilDCDR5EY3LLN1Rt7RumMXC\"")

        return chain.proceed(authRequest.build())

    }
}
