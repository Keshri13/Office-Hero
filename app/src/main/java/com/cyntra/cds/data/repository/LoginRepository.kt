package com.cyntra.cds.data.repository

import com.cyntra.cds.constants.DEVICE_ID
import com.cyntra.cds.constants.SOURCE
import com.cyntra.cds.data.model.request.LoginRequest
import com.cyntra.cds.data.network.handleApi
import com.cyntra.cds.data.model.response.LoginResponse
import com.cyntra.cds.data.network.service.LoginService
import com.cyntra.cds.ui.common.util.convertToJson
import javax.inject.Inject

class LoginRepository @Inject constructor(
    private val loginService: LoginService,
) : BaseRepository() {

    suspend fun doLogin(employeeNumber: String, password: String) =
        handleApi {
            loginService.doLogin(LoginRequest(employeeNumber, password))
        }

    fun saveLoginDetails(it: LoginResponse) {
        sharedPreferenceUtil.loginResponse = convertToJson(it)
    }
}