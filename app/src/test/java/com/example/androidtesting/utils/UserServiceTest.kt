package com.example.androidtesting.utils

import com.example.androidtesting.mock.LOGIN_STATUS
import com.example.androidtesting.mock.UserRepository
import com.example.androidtesting.mock.UserService
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class UserServiceTest {

    @Mock
    lateinit var userRepository: UserRepository

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        Mockito.`when`(userRepository.loginUser(anyString(), anyString()))
            .thenReturn(LOGIN_STATUS.INVALID_PASSWORD)
    }

    @Test
    fun testUserService() {
        val service = UserService(userRepository)
        val status = service.loginUser("abc@gmail.com","1234567890")
        Assert.assertEquals("Password is invalid",status)
    }
}
