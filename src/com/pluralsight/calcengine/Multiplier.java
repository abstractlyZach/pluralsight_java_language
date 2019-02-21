package com.pluralsight.calcengine;

public class Multiplier implements MathProcessing {

    @Override
    public String getKeyword() {
        return "multiply";
    }

    @Override
    public char getSymbol() {
        return '*';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return leftVal * rightVal;
    }
}
