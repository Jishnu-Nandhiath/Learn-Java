package com.practice;

public class CalculatorUtility {
    private double firstValue;
    private double secondValue;
    public CalculatorUtility(double firstValue,double secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
    public double adder(){
        return this.firstValue + this.secondValue;
    }

}
