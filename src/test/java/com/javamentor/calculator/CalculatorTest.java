package com.javamentor.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void process_shouldReturnArabicSum_whenGivenTwoArabicNumbers() {
        assertEquals("10", calculator.process("3 + 7"));
    }

    @Test
    void process_shouldReturnRomanSum_whenGivenTwoRomanNumbers() {
        assertEquals("X", calculator.process("III + VII"));
    }

    @Test
    void process_shouldThrowException_whenGivenTwoDifferentFormatNumbers() {
        assertThrows(IllegalArgumentException.class , () -> calculator.process("III * 3"));
    }

    @Test
    void process_shouldThrowException_whenGivenNumbersOutOfRange() {
        assertThrows(IllegalArgumentException.class , () -> calculator.process("3 + 17"));
    }

    @Test
    void process_shouldReturnBigRomanNumber_whenMultiplyNines() {
        assertEquals("LXXXI", calculator.process("IX * IX"));
    }

    @Test
    void process_shouldReturnBigArabicNumber_whenMultiplyFives() {
        assertEquals("25", calculator.process("5 * 5"));
    }

}
