package com.example.officehero.data.network.service

import com.example.officehero.constants.network.DEVICE_LOG_URL
import com.example.officehero.constants.network.SESSION_URL
import com.example.officehero.data.model.request.CrashErrorRequest
import com.example.officehero.data.model.request.SessionCloseRequest
import com.example.officehero.data.model.request.SessionStartRequest
import com.example.officehero.data.model.response.DeviceLogResponse
import com.example.officehero.data.model.response.SessionCloseResponse
import com.example.officehero.data.model.response.SessionStartResponse
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