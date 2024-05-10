package com.example.androidtesting

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performTextReplacement
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginScreenTest {

    @get: Rule
    //@JvmField
    val composeTestRule = createComposeRule()

    @Test
    fun loginScreen() {
        val email = "test@example.com"
        val password = "abcdefghijklmnopqrstuvwxyz"

        composeTestRule.setContent {
            LoginScreen()
        }

        // Find the email TextField and perform text input
        composeTestRule.onNodeWithText("email").performTextClearance()
        composeTestRule.onNodeWithText("email").performTextInput(email)
        composeTestRule.onNodeWithText("email").performTextClearance()
        composeTestRule.onNodeWithText("email").performTextReplacement(email)
        composeTestRule.onNodeWithText("email").performTextClearance()

        //composeTestRule.onNodeWithText("password").performTextClearance()
        composeTestRule.onNodeWithText("password").performTextInput(password)

        // Find the ENTER button and perform a click
        composeTestRule.onNodeWithText("ENTER").performClick()

        assert(email.isNotEmpty())
        assert(password.isNotEmpty())

    }

    @Composable
    private fun LoginScreen() {
        Column {
            var email = "test@example.com"
            var password = "test@password"

            TextField(
                value = "email",
                onValueChange = { email = it },
                placeholder = { Text(text = email) }
            )
            TextField(
                value = "password",
                onValueChange = { password = it },
                placeholder = { Text(text = password) }
            )

            Button(onClick = {}) {
                Text(text = "ENTER")
            }
        }
    }
}
