package com.example.androidtesting.mock

class UserService(private val repository: UserRepository) {

    fun loginUser(email:String,password:String): String {
        val status = repository.loginUser(email, password)
        return when(status) {
            LOGIN_STATUS.INVALID_USER -> "User doesn't exists"
            LOGIN_STATUS.INVALID_PASSWORD -> "Password is invalid"
            LOGIN_STATUS.UNKNOWN_ERROR -> "Unknown error occurred"
            LOGIN_STATUS.SUCCESS -> "Logged in successfully"
        }
    }
}
