package com.javamentor.calculator.actions;

public class AddAction implements Action{
    public int execute(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
