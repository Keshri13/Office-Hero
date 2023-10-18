package com.cyntra.cds.data.network.service

import com.cyntra.cds.constants.network.LOGIN_URL
import com.cyntra.cds.data.model.request.LoginRequest
import com.cyntra.cds.data.model.response.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {
    @POST(LOGIN_URL)
    suspend fun doLogin(
        @Body loginRequest: LoginRequest
    ): Response<LoginResponse>
}