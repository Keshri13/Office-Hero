package com.example.officehero.data.repository

import com.example.officehero.constants.DEVICE_ID
import com.example.officehero.constants.SOURCE
import com.example.officehero.data.local.sharedPreference.SharedPreferenceUtil
import com.example.officehero.data.model.request.CrashErrorRequest
import com.example.officehero.data.model.response.CrashErrorResponse
import com.example.officehero.data.network.handleApi
import com.example.officehero.data.network.service.CrashErrorService
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

