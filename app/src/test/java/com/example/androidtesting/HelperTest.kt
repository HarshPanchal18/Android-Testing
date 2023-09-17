package com.example.androidtesting

import com.example.androidtesting.utils.Helper
import org.junit.Assert.*

import org.junit.Test

class HelperTest {

    @Test
    fun isPalindrome() {

        // Arrange
        val helper = Helper()

        // Act
        val result = helper.isPalindrome("Hello")

        // Assert
        assertEquals(false,result)
    }
    @Test
    fun isPalindrome_input_level_expectTrue() {

        // Arrange
        val helper = Helper()

        // Act
        val result = helper.isPalindrome("level")

        // Assert
        assertEquals(true,result)
    }
}
