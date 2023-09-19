package com.example.androidtesting.utils

class Password {

    fun isValidPassword(password: String): Boolean {
        if (password == "")
            return false
        else if (password.length < 6 || password.length > 15)
            return false

        return true
    }
}
