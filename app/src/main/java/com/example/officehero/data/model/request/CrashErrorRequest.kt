package com.example.officehero.data.model.request

data class CrashErrorRequest(
    val details: String,
    val device_id: String,
    val source: String,
    val store_id: String
)