package com.example.androidtesting.utils

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class) // Execute as parameterized class
class ParameterizedExample(val input: String, val expectedValue: Boolean) {

    @Test
    fun test() {
        val helper = Helper()
        val result = helper.isPalindrome(input)

        assertEquals(expectedValue, result)
    }

    companion object {

        @JvmStatic
        @Parameters(name = "{index}: {0} is palindrome - {1}")
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("Hello", false),
                arrayOf("level", true),
                arrayOf("$", true),
                arrayOf("", true),
            )
        }
    }
}
