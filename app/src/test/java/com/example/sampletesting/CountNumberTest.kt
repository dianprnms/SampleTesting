package com.example.sampletesting

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CountNumberTest {
    private val testCountNumber : CountNumber= CountNumber()

    @Test
    fun tesSum(){
        val expected = 42
        assertEquals(expected, testCountNumber.sum(40,2))
    }
}