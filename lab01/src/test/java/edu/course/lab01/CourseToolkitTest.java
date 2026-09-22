package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }
    
    @Test
    void returnsTrueForZero() {
        boolean result = CourseToolkit.isEven(0);

        assertTrue(result);
    }
    
    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }
    
    @Test
    void returnsFalseForNumberLessThanTwo() {
        boolean result = CourseToolkit.isPrime(1);

        assertFalse(result);
    }

    @Test
    void returnsTrueForTwo() {
        boolean result = CourseToolkit.isPrime(2);

        assertTrue(result);
    }

    @Test
    void returnsFalseForCompositeNumber() {
        boolean result = CourseToolkit.isPrime(15);

        assertFalse(result);
    }

    @Test
    void returnsFalseForSquareOfPrimeNumber() {
        boolean result = CourseToolkit.isPrime(49);

        assertFalse(result);
    }
    
    @Test
    void returnsTrueForPalindrome() {
        boolean result = CourseToolkit.isPalindrome("level");

        assertTrue(result);
    }

    @Test
    void returnsFalseForNonPalindrome() {
        boolean result = CourseToolkit.isPalindrome("hello");

        assertFalse(result);
    }

    @Test
    void throwsExceptionForNullText() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.isPalindrome(null));
    }
    
    @Test
    void returnsAverageForPositiveNumbers() {
        int[] values = {2, 4, 6};

        double result = CourseToolkit.average(values);

        assertEquals(4.0, result);
    }

    @Test
    void returnsAverageForNegativeNumbers() {
        int[] values = {-2, -4, -6};

        double result = CourseToolkit.average(values);

        assertEquals(-4.0, result);
    }

    @Test
    void throwsExceptionForEmptyArray() {
        int[] values = {};

        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(values));
    }
}
