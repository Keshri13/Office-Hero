package com.example.officehero.data.network.service


import com.example.officehero.constants.network.CRASH_ERROR_URL
import com.example.officehero.data.model.request.CrashErrorRequest
import com.example.officehero.data.model.response.CrashErrorResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface CrashErrorService {

    @POST(CRASH_ERROR_URL)
    suspend fun getCrashError(
        @Body crashErrorReq: CrashErrorRequest
    ): Response<CrashErrorResponse>

}