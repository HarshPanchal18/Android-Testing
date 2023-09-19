package com.example.androidtesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException

class QuoteManagerTest {

    private lateinit var quoteManager: QuoteManager
    private lateinit var context: Context

    @Before
    fun setUp() {
        quoteManager = QuoteManager()
        context = ApplicationProvider.getApplicationContext()
    }

    @After
    fun tearDown() {
    }

    @Test(expected = FileNotFoundException::class) // Let the instruct the compiler that it will be FileNotFoundException
    // test would succeed if and only if an exception of the specified class is thrown by the method.
    fun populateQuoteFromAssets() {
        quoteManager.populateQuoteFromAssets(context,"")
    }

    @Test(expected = JsonSyntaxException::class)
    fun testPopulateQuoteFromAssets_InvalidJson_Expected_Exception() {
        quoteManager.populateQuoteFromAssets(context,"malformed.json")
    }

    @Test
    fun testPopulateQuoteFromAssets_ValidJson_Expected_Count() {
        quoteManager.populateQuoteFromAssets(context,"quotes.json")
        assertEquals(6,quoteManager.quoteList.size)
    }

    @Test
    fun testPreviousQuote_expected_CorrectQuote() {
        quoteManager.populateQuotes(
            arrayOf(
                Quote("This is the first quote","1"),
                Quote("This is the second quote","2"),
                Quote("This is the third quote","3"),
            )
        )

        val quote = quoteManager.getPreviousQuote()

        assertEquals("1",quote.author)
    }

    @Test
    fun testNextQuote_expected_CorrectQuote() {
        quoteManager.populateQuotes(
            arrayOf(
                Quote("This is the first quote","1"),
                Quote("This is the second quote","2"),
                Quote("This is the third quote","3"),
            )
        )

        val quote = quoteManager.getNextQuote()

        assertEquals("2",quote.author)
    }
}
