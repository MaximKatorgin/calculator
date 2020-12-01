package com.javamentor.calculator;

public class InputValidator {
    private String[] inputArray;

    public void validateInput(String inputString) {
        inputArray = InputParser.parseInputToArray(inputString);
        checkOnLength();
        checkIfActionExists();
        checkIfNumbersExists(inputArray[0]);
        checkIfNumbersExists(inputArray[2]);
        checkNumbersOnSameFormat();
    }

    private void checkIfNumbersExists(String number) {
        if (!(InputParser.getArabicNumbers().containsKey(number) || InputParser.getRomanNumbers().containsKey(number))) {
            throw new IllegalArgumentException("No such number: " + number);
        }
    }

    private void checkNumbersOnSameFormat() {
        if (!(InputParser.getArabicNumbers().containsKey(inputArray[2])
                    && InputParser.getArabicNumbers().containsKey(inputArray[0])
                    || InputParser.getRomanNumbers().containsKey(inputArray[2])
                    && InputParser.getRomanNumbers().containsKey(inputArray[0]))) {
            throw new IllegalArgumentException("Different number formats");
        }

    }

    private void checkIfActionExists() {
        if (!InputParser.getActions().containsKey(inputArray[1])) {
            throw new IllegalArgumentException("No such action: " + inputArray[1]);
        }
    }

    private void checkOnLength() {
        if (inputArray.length != 3) {
            throw new IllegalArgumentException("Incorrect amount of symbols");
        }
    }
}
