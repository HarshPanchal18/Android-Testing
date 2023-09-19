package com.example.androidtesting.utils

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StringTest {

    private lateinit var string: ReverseString

    @Before
    fun setUp() {
        string = ReverseString()
    }

    @Test
    fun testStringReverse_EmptyString_ExpectedEmptyString() {
        val result = string.reverseString("")
        Assert.assertEquals("", result)
    }

    @Test
    fun testStringReverse_SingleChar_ExpectedSingleChar() {
        val result = string.reverseString("t")
        Assert.assertEquals("t", result)
    }

    @Test
    fun testStringReverse_ValidInput_ExpectedReversedString() {
        val result = string.reverseString("total")
        Assert.assertEquals("latot", result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testStringReverse_NullValue_ExpectedException() {
        val result = string.reverseString(null)
        //Assert.assertEquals(null, result)
    }
}
