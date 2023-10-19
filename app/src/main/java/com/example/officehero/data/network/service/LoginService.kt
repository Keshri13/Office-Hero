package com.example.officehero.data.network.service

import com.example.officehero.constants.network.LOGIN_URL
import com.example.officehero.data.model.request.LoginRequest
import com.example.officehero.data.model.response.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {
    @POST(LOGIN_URL)
    suspend fun doLogin(
        @Body loginRequest: LoginRequest
    ): Response<LoginResponse>
}