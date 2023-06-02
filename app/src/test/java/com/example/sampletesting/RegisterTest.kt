package com.example.sampletesting

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class RegisterTest {

    lateinit var regist : Register
    @Before
    fun setUp(){
        regist = Register()
    }

    @Test
    fun username_is_empty(){
        val username = ""
        val result = regist.validateRegistrationInput(username,"dianpurnama","dianpurnama")
        assertEquals("username empty", result, false)
    }


    @Test
    fun password_is_Empty(){
        val username = "Dianpurnama"
        val result = regist.validateRegistrationInput(username,"","dianpurnama")
        assertEquals("password empty", result, false)
    }

    @Test
    fun confirmPassword_is_empty(){
        val username = "Dianpurnama"
        val result = regist.validateRegistrationInput(username,"dianpurnama","")
        assertEquals("confirmed password empty", result, false)
    }

    @Test
    fun password_confirmPasword_not_the_same(){
        val username = "Dianpurnama"
        val result = regist.validateRegistrationInput(username,"dianpurnama","dianpurnamaa")
        assertEquals("password and confirm password not the same", result, false)
    }

    @Test
    fun password_very_short(){
        val username = "Dianpurnama"
        val result = regist.validateRegistrationInput(username,"dian","dian")
        assertEquals("password very short", result, false)
    }

    @Test
    fun username_already(){
        val username = "Behroz"
        val result = regist.validateRegistrationInput(username,"dian","dian")
        assertEquals("username alreacy", result, false)
    }

}