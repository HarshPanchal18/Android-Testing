package com.example.androidtesting.utils

import org.junit.Before
import org.junit.Test
import org.junit.Assert.*

class PasswordTest {

    private lateinit var password: Password

    @Before
    fun setUp() {
        password = Password()
    }

    @Test
    fun isBlankIsValidPassword() {
        var result = password.isValidPassword("Password")
        assertEquals(true, result)

        result = password.isValidPassword("")
        assertEquals(false, result)

        result = password.isValidPassword("Pass")
        assertEquals(false, result)
    }
}
