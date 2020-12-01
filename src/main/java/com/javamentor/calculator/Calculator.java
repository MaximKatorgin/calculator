package com.javamentor.calculator;

public class Calculator {

    private InputParser inputParser = new InputParser();
    private InputValidator inputValidator = new InputValidator();

    public String process(String inputString) {
        inputValidator.validateInput(inputString);
        String[] inputArray = InputParser.parseInputToArray(inputString);
        int result = inputParser.getActionBySymbol(inputArray[1]).execute(
                inputParser.convertStringToNumber(inputArray[0]),
                inputParser.convertStringToNumber(inputArray[2])
        );
        if (inputParser.isRoman(inputArray[0])) {
            return inputParser.getRomanSymbolOfNumber(result);
        }
        return String.valueOf(result);
    }
}
