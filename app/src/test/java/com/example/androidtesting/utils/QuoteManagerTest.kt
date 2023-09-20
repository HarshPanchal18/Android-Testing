package com.example.androidtesting.utils

import android.content.Context
import android.content.res.AssetManager
import com.example.androidtesting.QuoteManager
import com.nhaarman.mockitokotlin2.doReturn
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class QuoteManagerTest {

    @Mock
    lateinit var context: Context

    @Mock
    lateinit var assetManager: AssetManager

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this) // Init both the objects
    }

    @Test
    fun test() {
        val testStream = QuoteManagerTest::class.java.getResourceAsStream("/quotes.json")

        // When the `context`'s assets property is called, return the `assetManager`
        doReturn(assetManager).`when`(context).assets // Link both the objects

        Mockito.`when`(context.assets.open(anyString())).thenReturn(testStream)

        val quoteManager = QuoteManager()
        quoteManager.populateQuoteFromAssets(context,"")
        val quote = quoteManager.getCurrentQuote()

        Assert.assertEquals("Genius is one percent inspiration and ninety-nine percent perspiration.",quote.text)
        //Assert.assertEquals("You can observe a lot by observing.",quote.text)
    }
}
