package com.cyntra.cds.ui.crashhandler

import android.os.Bundle
import androidx.activity.viewModels
import com.cyntra.cds.databinding.ActivityCrashErrorBinding
import com.cyntra.cds.ui.base.BaseActivity
import com.cyntra.cds.ui.common.util.moveToScreenWithFinish
import com.cyntra.cds.ui.login.LoginActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CrashErrorActivity : BaseActivity() {
    private val binding by lazy { ActivityCrashErrorBinding.inflate(layoutInflater) }
    private val viewModel by viewModels<CrashErrorViewModel>()
    private var errorReport = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        init()
        getExtraIfAny()
        observers()
    }

    fun init() {
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        baseViewModel = viewModel
        setUpClickListeners()
    }

    private fun getExtraIfAny(){
        errorReport = intent.getStringExtra("error").toString()
    }


    override fun observers() {
        super.observers()
        viewModel.crashErrorResponse.observe(this) {
            moveToScreenWithFinish(LoginActivity::class.java,"")
        }
    }

    private fun callCrashErrorApi() {
        viewModel.getCrashError(errorReport)
    }

    fun setUpClickListeners() {
        binding.btnCrashErorrOky.setOnClickListener {
            callCrashErrorApi()
        }
    }
}