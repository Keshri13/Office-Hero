package com.example.officehero.ui.base

import android.annotation.SuppressLint
import android.content.Context
import android.speech.SpeechRecognizer.*
import android.util.Log
import androidx.lifecycle.*
import com.example.officehero.R
import com.example.officehero.data.local.sharedPreference.SharedPreferenceUtil
import com.example.officehero.data.network.Error
import com.example.officehero.data.network.Exception
import com.example.officehero.data.network.NetworkResult
import com.example.officehero.data.repository.BaseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.*
import javax.inject.Inject

@HiltViewModel
open class BaseViewModel @Inject constructor(val baseRepository: BaseRepository) :
    ViewModel() {

    var activityName: String = "BaseActivity"
    var TAG = "BaseViewModel"

    @Inject
    lateinit var sharedPreferenceUtil: SharedPreferenceUtil

    @SuppressLint("StaticFieldLeak")
    @Inject
    @ApplicationContext
    lateinit var application: Context
    var mProgress = MutableLiveData<Boolean>()
    var errorMessageId = MutableLiveData<Int>()
    var errorMessage = MutableLiveData<String>()
    var successfulMessage = MutableLiveData<String>()

    init {

    }


    fun handleError(response: NetworkResult<*>) {
        when (response) {
            is Exception -> {
                Log.d(TAG, "API error: ${response.exception}")
                errorMessageId.postValue(R.string.something_went_wrong)
            }

            is Error -> {
                when (val statusCode = response.code) {
                    404 -> errorMessage.postValue(response.message.toString())
                    500 -> errorMessage.postValue(response.message.toString())
                    502 -> errorMessage.postValue(response.message.toString())
                    401 -> errorMessage.postValue(response.message.toString())
                    else -> errorMessage.postValue("$statusCode: ${response.message}")
                }
            }

            else -> {
                Log.d(TAG, "handleError: Unknown error response type")
            }
        }
    }

}