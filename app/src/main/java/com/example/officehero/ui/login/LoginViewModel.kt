package com.example.officehero.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.officehero.data.model.response.LoginResponse
import com.example.officehero.data.model.response.SessionStartResponse
import com.example.officehero.data.network.Success
import com.example.officehero.data.repository.LoginRepository
import com.example.officehero.data.repository.SessionRepository
import com.example.officehero.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginRepository: LoginRepository,
    private val sessionRepository: SessionRepository
) :
    BaseViewModel(loginRepository) {

    val employeeId = MutableStateFlow("Acbsd@gmail.com")
    val password = MutableStateFlow("1234")
    var isPermissionCheck = MutableStateFlow(false)


    fun setIsPermissionCheck(value: Boolean) {
        viewModelScope.launch {
            isPermissionCheck.emit(value)
        }
    }

    private var _loginResponse = MutableLiveData<LoginResponse>()
    val loginResponse get() = _loginResponse

    fun doLogin() {
        mProgress.postValue(true)
        viewModelScope.launch {
            val response = loginRepository.doLogin(employeeId.value, password.value)
            mProgress.postValue(false)
            when (response) {
                is Success -> response.data.let {
                    loginRepository.saveLoginDetails(it)
                   // employeeId.emit(it.data.employee.emp_no)
                    _loginResponse.postValue(it)

                }

                else -> handleError(response)
            }
        }
    }

    private var _sessionStartResponse = MutableLiveData<SessionStartResponse>()
    val sessionStartResponse get() = _sessionStartResponse

    fun doSessionStart() {
        mProgress.postValue(false)
        viewModelScope.launch {
            val response = sessionRepository.doSessionStart(employeeId.value)
            mProgress.postValue(false)
            when (response) {
                is Success -> response.data.let {
                    sessionRepository.saveSessionStartDetails(it)
                    _sessionStartResponse.postValue(it)
                }

                else -> handleError(response)
            }
        }
    }
}