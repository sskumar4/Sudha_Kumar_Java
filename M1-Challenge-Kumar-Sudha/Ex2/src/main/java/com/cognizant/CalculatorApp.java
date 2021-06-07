package com.cognizant;

public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorObject calculator = new CalculatorObject();
/*
                - 1 + 1
                - 23 - 52
                - 34 * 2
                - 12 / 3
                - 12 / 7
                - 3.4 + 2.3
                - 6.7 * 4.4
                - 5.5 - 0.5
                - 10.8 / 2.2

 */
        System.out.println("1 + 1  = " + calculator.add(1, 1));
        System.out.println("23 - 2  = " + calculator.subtract(23, 2));
        System.out.println("34 * 2  = " + calculator.multiply(34, 2));
        System.out.println("12 / 3  = " + calculator.divide(12, 3));
        System.out.println("12 / 7  = " + calculator.divide(12, 7));
        System.out.println("3.4 + 2.3  = " + calculator.add(3.4, 2.3));
        System.out.println("6.7 * 4.4  = " + calculator.multiply(6.7, 4.4));
        System.out.println("5.5 - 0.5  = " + calculator.subtract(5.5, 0.5));
        System.out.println("10.8 - 2.2  = " + calculator.divide(10.8, 2.2));

    }
}
