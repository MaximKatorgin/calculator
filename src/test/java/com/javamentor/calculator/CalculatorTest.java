package com.javamentor.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void process_shouldReturnArabicSum_whenGivenTwoArabicNumbers() {
        assertEquals(calculator.process("3 + 7"), "10");
    }

    @Test
    void process_shouldReturnRomanSum_whenGivenTwoRomanNumbers() {
        assertEquals(calculator.process("III + VII"), "X");
    }

    @Test
    void process_shouldThrowException_whenGivenTwoDifferentFormatNumbers() {
        assertThrows(IllegalArgumentException.class , () -> calculator.process("III * 3"));
    }

    @Test
    void process_shouldThrowException_whenGivenNumbersOutOfRange() {
        assertThrows(IllegalArgumentException.class , () -> calculator.process("3 + 17"));
    }


}
