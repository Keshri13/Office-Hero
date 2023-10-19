package com.example.officehero.ui.internet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.officehero.databinding.ActivityNoInternetConnectionBinding
import com.example.officehero.ui.common.util.isInternetConnectionAvailable

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