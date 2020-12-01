package com.javamentor.calculator;

import com.javamentor.calculator.actions.*;

import java.util.HashMap;
import java.util.Map;

public class InputParser {
    private static HashMap<String, Integer> romanNumbers = new HashMap<>();
    private static HashMap<String, Integer> arabicNumbers = new HashMap<>();
    private static Map<String, Action> actions = Map.of("+", new AddAction(),
            "-", new SubstractAction(),
            "*", new MultiplyAction(),
            "/", new DivideAction());

    public InputParser() {
        String[] romanSymbols = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for(int i = 1; i < 11; i++) {
            arabicNumbers.put(String.valueOf(i), i);
            romanNumbers.put(romanSymbols[i - 1], i);
        }
    }

    public static String[] parseInputToArray(String stringInput) {
        return stringInput.split(" ");
    }

    public Action getActionBySymbol(String actionSymbol) {
        return actions.get(actionSymbol);
    }

    public int convertStringToNumber(String numberSymbol) {
        if (romanNumbers.containsKey(numberSymbol)) {
            return romanNumbers.get(numberSymbol);
        }
        return arabicNumbers.get(numberSymbol);
    }

    public boolean isRoman(String number) {
        return romanNumbers.containsKey(number);
    }
    public String getRomanSymbolOfNumber(int number) {
        return romanNumbers.entrySet().stream().filter(x -> x.getValue() == number).findFirst().get().getKey();
    }

    public static HashMap<String, Integer> getRomanNumbers() {
        return romanNumbers;
    }

    public static HashMap<String, Integer> getArabicNumbers() {
        return arabicNumbers;
    }

    public static Map<String, Action> getActions() {
        return actions;
    }
}
