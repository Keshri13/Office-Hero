package com.cyntra.cds.data.model.response

data class LoginResponse(
    val message: String,
    val user: User
)

data class User(
    val __v: Int,
    val _id: String,
    val email: String,
    val name: String,
    val new_Date: String,
    val password: String,
    val phone: String
)