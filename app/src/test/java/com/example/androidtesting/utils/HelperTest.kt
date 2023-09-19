package com.example.androidtesting.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HelperTest {
// Run tests with Code coverage is to analyze the number of classes, methods, and lines are affected throughout the testing
// Although Code coverage is 100% now but it does not mean that we have covered all the test scenarios.s

    private lateinit var helper: Helper
    @Before // method to be run before the Test method.
    fun setUp() {
        helper = Helper()
        println("Before every test cases")
    }

    @After
    fun tearDown() {
        println("After every test cases")
    }

    @Test
    fun isPalindrome() {

        // Arrange
        //val helper = Helper()

        // Act
        val result = helper.isPalindrome("Hello")

        // Assert
        assertEquals(false,result)
        //assertEquals(true,result)
    }
    @Test
    fun isPalindrome_input_level_expectTrue() {

        // Arrange
        //val helper = Helper()

        // Act
        val result = helper.isPalindrome("level")

        // Assert
        assertEquals(true,result)
    }
}
