package com.example.officehero.data.repository


import com.example.officehero.data.model.request.LoginRequest
import com.example.officehero.data.model.response.LoginResponse
import com.example.officehero.data.network.handleApi
import com.example.officehero.data.network.service.LoginService
import com.example.officehero.ui.common.util.convertToJson
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