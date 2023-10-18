package com.cyntra.cds.data.network.service

import com.cyntra.cds.constants.network.DEVICE_LOG_URL
import com.cyntra.cds.constants.network.SESSION_URL
import com.cyntra.cds.data.model.request.SessionCloseRequest
import com.cyntra.cds.data.model.request.SessionStartRequest
import com.cyntra.cds.data.model.response.SessionCloseResponse
import com.cyntra.cds.data.model.response.SessionStartResponse
import com.cyntra.cds.data.model.request.CrashErrorRequest
import com.cyntra.cds.data.model.response.DeviceLogResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface SessionService {

    @POST(SESSION_URL)
    suspend fun doSessionStart(
        @Body sessionStartRequest: SessionStartRequest
    ): Response<SessionStartResponse>

    @POST(SESSION_URL)
    suspend fun doSessionClose(
        @Body sessionCloseRequest: SessionCloseRequest
    ): Response<SessionCloseResponse>


    @POST(DEVICE_LOG_URL)
    suspend fun getDeviceLogReport(
        @Body crashErrorReq: CrashErrorRequest
    ): Response<DeviceLogResponse>

}