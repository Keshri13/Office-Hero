package com.cyntra.cds.ui.internet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cyntra.cds.databinding.ActivityNoInternetConnectionBinding
import com.cyntra.cds.ui.common.util.isInternetConnectionAvailable

class NoInternetActivity : AppCompatActivity() {

    val binding by lazy { ActivityNoInternetConnectionBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        init()
        setUpClickListeners()
    }

    fun init(){
        isInternetConnectionAvailable()
    }

     private fun setUpClickListeners(){
        binding.btnRefresh.setOnClickListener {
           isInternetConnectionAvailable()
        }
    }
}