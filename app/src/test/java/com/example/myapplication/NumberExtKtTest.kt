package com.example.myapplication

import junit.framework.TestCase.assertEquals
import org.junit.Test

class NumberExtKtTest {
    @Test
    fun maxPrimeNumber_MultiplePrimes() {
        // List with multiple prime numbers: Pass a list containing multiple prime numbers and verify the function returns the largest prime number as a String.
        // Example: input = [2, 3, 5, 7], expected output = "7"
        val numbers = listOf(2, 3, 5, 7)
        val expectedOutput = "7"
        val actualOutput = maxPrime(numbers)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun maxPrimeNumber_SinglePrime() {
        // List with one prime number: Pass a list containing a single prime number and verify the function returns that prime number as a String.
        // Example: input = [13], expected output = "13"
        // TODO Implement test
    }

    @Test
    fun maxPrimeNumber_EmptyList() {
        // Empty list: Pass an empty list and verify the function returns "No prime numbers found."
        // Example: input = [], expected output = "No prime numbers found."
        // TODO Implement test
    }

    @Test
    fun maxPrimeNumber_NoPrimes() {
        // List with no prime numbers: Pass a list containing only non-prime numbers and verify the function returns "No prime numbers found."
        // Example: input = [4, 6, 8, 10], expected output = "No prime numbers found."
        // TODO Implement test
    }

    @Test
    fun maxPrimeNumber_NegativeNumbers() {
        // List with negative numbers: Pass a list containing negative numbers and verify the function handles them correctly (they should be ignored).
        // Example: input = [-2, 0, 2, 3], expected output = "3"
        // TODO Implement test
    }

    @Test
    fun maxPrimeNumber_Duplicates() {
        // List with duplicates: Pass a list containing duplicate prime numbers and verify the function returns the largest prime number (regardless of duplicates).
        // Example: input = [2, 3, 5, 5, 7], expected output = "7"
        // TODO Implement test
    }

    @Test
    fun maxPrimeNumber_VeryLargeList() {
        // Very large list: Pass a very large list with a mix of prime and non-prime numbers to test performance.
        // TODO Implement test
    }

    @Test
    fun isPrime_PrimeNumbers() {
        // Prime numbers: Test with various prime numbers (2, 3, 5, 7, 11, etc.) and verify the function returns `true`.
        // TODO Implement test
    }

    @Test
    fun isPrime_NonPrimeNumbers() {
        // Non-prime numbers: Test with various non-prime numbers (4, 6, 8, 9, 10, etc.) and verify the function returns `false`.
        // TODO Implement test
    }

    @Test
    fun isPrime_ZeroAndOne() {
        // Zero and one: Test with 0 and 1, both of which are not prime, and verify the function returns `false`.
        // TODO Implement test
    }

    @Test
    fun isPrime_NegativeNumbers() {
        // Negative numbers: Test with negative numbers and verify the function returns `false`.
        // TODO Implement test
    }

    @Test
    fun isPrime_LargePrimeNumbers() {
        // Large prime numbers: Test with very large prime numbers to ensure the function handles them efficiently.
        // TODO Implement test
    }

    @Test
    fun isPrime_SquareRootBoundary() {
        // Numbers around the square root boundary: Test with numbers just below and above the square root of a prime number to ensure the loop condition in `isPrime` works correctly.
        // TODO Implement test
    }
}