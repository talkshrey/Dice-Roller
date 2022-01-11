package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number() {
        val dice = MainActivity.Dice(6)
        val rolledNumber = dice.roll()
        assertTrue("The value is not between 1 to 6", rolledNumber in 1..6)
    }
}