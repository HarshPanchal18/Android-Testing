package com.example.androidtesting.utils

class Password {

    fun isValidPassword(password: String): Boolean {
        if (password == "")
            return false
        else if (password.length < 6 || password.length > 15)
            return false

        return true
    }

    fun isValidPassword2(password: String) = when {
        password.isBlank() -> "Password is required field"
        password.length < 6 -> "Length of password should be greater than 6"
        password.length > 15 -> "Length of password should be less than 15"
        else -> "Valid"
    }
}
