package com.pluralsight.calcengine;

public class Adder implements MathProcessing {
    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return leftVal + rightVal;
    }
}
