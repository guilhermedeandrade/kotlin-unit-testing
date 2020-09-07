package com.example.kotlinplayground

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun `add function returns the correct result`() {
        val mathStuff = MathStuff()
        val result = mathStuff.add(21, 21)

        assertEquals(42, result)
    }

    @Test
    fun `multiply function returns the correct result`() {
        val mathStuff = MathStuff()
        val result = mathStuff.multiply(21, 2)

        assertEquals(42, result)
    }

    @Test
    fun `divide function returns the correct result`() {
        val mathStuff = MathStuff()
        val result = mathStuff.divide(84, 2)

        assertEquals(42, result)
    }
}