package com.cyntra.cds.data.network.service


import com.cyntra.cds.constants.network.CRASH_ERROR_URL
import com.cyntra.cds.data.model.request.CrashErrorRequest
import com.cyntra.cds.data.model.response.CrashErrorResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface CrashErrorService {

    @POST(CRASH_ERROR_URL)
    suspend fun getCrashError(
        @Body crashErrorReq: CrashErrorRequest
    ): Response<CrashErrorResponse>

}