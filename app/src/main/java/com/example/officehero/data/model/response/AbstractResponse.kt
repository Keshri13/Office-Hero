package com.example.officehero.data.model.response

open class AbstractResponse(
    open val message: String
) {
    override fun toString(): String {
        return "AbstractResponse(message='$message')"
    }
}