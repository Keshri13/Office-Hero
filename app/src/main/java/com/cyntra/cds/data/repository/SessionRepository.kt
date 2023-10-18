package com.cyntra.cds.data.repository

import com.cyntra.cds.constants.DEVICE_ID
import com.cyntra.cds.constants.SOURCE
import com.cyntra.cds.data.network.handleApi
import com.cyntra.cds.data.model.request.SessionStartRequest
import com.cyntra.cds.data.model.response.SessionStartResponse
import com.cyntra.cds.data.network.service.SessionService
import com.cyntra.cds.ui.common.util.Util
import com.cyntra.cds.ui.common.util.convertToJson
import com.cyntra.cds.data.model.request.CrashErrorRequest
import com.cyntra.cds.data.model.response.DeviceLogResponse
import com.google.gson.Gson
import javax.inject.Inject

class SessionRepository @Inject constructor(private val sessionService: SessionService) :
    BaseRepository() {

//    suspend fun doSessionClose() = handleApi {
//       // sessionService.doSessionClose(Util(sharedPreferenceUtil))
//    }

    suspend fun doSessionStart(employeeId: String) = handleApi {
        sessionService.doSessionStart(
            SessionStartRequest(
                sharedPreferenceUtil.storeId,
                employeeId,
                0,
                "In"
            )
        )
    }

    suspend fun getDeviceLogReport(deviceLog: String) =
        handleApi {
            sessionService.getDeviceLogReport(
                CrashErrorRequest(
                    deviceLog,
                    DEVICE_ID,
                    SOURCE,
                    sharedPreferenceUtil.storeId
                )
            )
        }


    fun saveSessionStartDetails(it: SessionStartResponse) {
        sharedPreferenceUtil.sessionStartResponse = convertToJson(it)
        sharedPreferenceUtil.sessionId = it.data.session_id
    }

    fun saveDeviceLogResponse(it: DeviceLogResponse) {
        sharedPreferenceUtil.deviceLogReport = Gson().toJson(it)
    }

    fun clearSharedPreference() {
        sharedPreferenceUtil.clear()
    }

}