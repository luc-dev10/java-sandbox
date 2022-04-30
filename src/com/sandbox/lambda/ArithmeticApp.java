package com.sandbox.lambda;

public class ArithmeticApp {
    public static void main(String[] args) {

        // storing lambdas as variables
        IMath addition = Integer::sum;
        IMath subtraction = (x, y) -> x - y;
        IMath multiplication = (x, y) -> x * y;
        IMath division = (x, y) -> x / y;

        // calculating
        calculateAndDisplay(addition, 1, 2);
        calculateAndDisplay(subtraction, 1, 2);
        calculateAndDisplay(multiplication, 1, 2);
        calculateAndDisplay(division, 1, 2);
        
    }

    public static void calculateAndDisplay(IMath math, int x, int y) {
        System.out.println(math.calculate(x, y));
    }

}
