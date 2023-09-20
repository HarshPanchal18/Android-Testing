package com.example.androidtesting.mock

class UserRepository {

    private val allUsers = listOf(
        User(1, "John", "john@mail.com", "12345678"),
        User(2, "Hein", "hein@mail.com", "87654321"),
        User(3, "Emily", "emily@mail.com", "14785203"),
    )

    fun loginUser(email: String, password: String): LOGIN_STATUS {
        val users = allUsers.filter { user -> user.email == email }
        return if (users.size == 1) {
            if (users[0].password == password)
                LOGIN_STATUS.SUCCESS
            else
                LOGIN_STATUS.INVALID_PASSWORD
        } else
            LOGIN_STATUS.INVALID_USER
    }
}
