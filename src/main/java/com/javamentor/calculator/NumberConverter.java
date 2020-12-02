package com.javamentor.calculator;

public class NumberConverter {
    private static final String[] romanSymbols = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static String convertIntToRomanString(int arabicNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        if (arabicNumber == 100) {
           return "C";
        } else {
            stringBuilder.append(processTens(arabicNumber / 10))
            .append(processOnes(arabicNumber % 10));
        }
        return stringBuilder.toString();
    }

    private static String processTens(int arabicNumber) {
        StringBuilder amountOfTens;
        if (arabicNumber == 9) {
            return "XC";
        } else if (arabicNumber > 4) {
            amountOfTens = new StringBuilder("L");
            for (int i = 0; i < arabicNumber - 5; i++) {
                amountOfTens.append("X");
            }
            return amountOfTens.toString();
        } else if (arabicNumber == 4) {
            return "XL";
        } else if (arabicNumber > 0){
            amountOfTens = new StringBuilder();
            for (int i = 0; i < arabicNumber; i++) {
                amountOfTens.append("X");
            }
            return amountOfTens.toString();
        }
        return "";
    }

    private static String processOnes(int arabicNumber) {
        return romanSymbols[arabicNumber];
    }
}
