package com.example.sampletesting

import junit.framework.TestCase
import org.junit.After
import org.junit.Before
import org.junit.Test

class LoginTest {
    lateinit var login : Login

    @Before
    fun setUp() {
        login = Login()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun username_is_empty() {
        val username = ""
        val assert = login.validate(username, "coba@email", "cobacoba", 16)
        assert(assert == "please enter username")
    }


    @Test
    fun username_length_less_than_6() {
        val username = "ns"
        assert(
            Login().validate(username, "coba@gmail", "cobacoba", 14)
                    == "very short username"
        )
    }

    @Test
    fun username_length_very_long(){
        val username="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbcccccccccccccc"
        assert(
            Login().validate(username, "dian@gmail.com", "diandian", 20)
                    == "long username"
        )
    }

    @Test
    fun  email_is_empty(){
        val username = "Dianpurnama"
        assert(
            Login().validate(username, "", "diandian", 21)
                    == "please enter email"
        )
    }

    @Test
    fun  email_is_not_at(){
        val username = "Dianpurnama"
        assert(
            Login().validate(username, "diangmail.com", "diandian", 21)
                    == "please enter valid email"
        )
    }

    @Test
    fun  password_is_empty(){
        val username = "Dianpurnama"
        assert(
            Login().validate(username, "dian@gmail.com", "", 21)
                    == "please enter password"
        )
    }








}