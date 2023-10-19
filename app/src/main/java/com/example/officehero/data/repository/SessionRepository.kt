package com.example.officehero.data.repository

import com.cyntra.cds.ui.common.util.convertToJson
import com.example.officehero.constants.DEVICE_ID
import com.example.officehero.constants.SOURCE
import com.example.officehero.data.model.request.CrashErrorRequest
import com.example.officehero.data.model.request.SessionStartRequest
import com.example.officehero.data.model.response.DeviceLogResponse
import com.example.officehero.data.model.response.SessionStartResponse
import com.example.officehero.data.network.handleApi
import com.example.officehero.data.network.service.SessionService
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