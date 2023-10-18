package com.cyntra.cds.data.repository

import com.cyntra.cds.constants.DEVICE_ID
import com.cyntra.cds.constants.SOURCE
import com.cyntra.cds.data.local.sharedPreference.SharedPreferenceUtil
import com.cyntra.cds.data.network.handleApi
import com.cyntra.cds.data.network.service.CrashErrorService
import com.cyntra.cds.data.model.request.CrashErrorRequest
import com.cyntra.cds.data.model.response.CrashErrorResponse
import com.google.gson.Gson
import javax.inject.Inject

open class BaseRepository @Inject constructor() {

    @Inject
    lateinit var sharedPreferenceUtil: SharedPreferenceUtil

    @Inject
    lateinit var crashService: CrashErrorService

    suspend fun getCrashError(error: String) = handleApi {
        crashService.getCrashError(
            CrashErrorRequest(error, DEVICE_ID, SOURCE, sharedPreferenceUtil.storeId)
        )
    }

    fun saveCrashErrorResponse(it: CrashErrorResponse) {
        sharedPreferenceUtil.crashError = Gson().toJson(it)
    }

}

