package com.javamentor.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String result = calculator.process(scanner.nextLine());
        System.out.println("Output:");
        System.out.println(result);


    }
}
