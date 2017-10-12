package com.kodilla;

public class Calculator {
    public int addition (int x, int y){
        return x + y;
    }

    public int subtraction (int x, int y){
        return x - y;
    }
    public static void main (String args[]){
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.addition(5, 10));

        System.out.println(myCalculator.subtraction(25, 5));
    }
}