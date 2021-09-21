package com.practice;

public class CalculatorUtility {
    private double firstUserInput;
    private double secondUserInput;

    public CalculatorUtility(double firstUserInput, double secondUserInput) {
        this.firstUserInput = firstUserInput;
        this.secondUserInput = secondUserInput;
    }

    public double performOperation(char operator) {
        switch (operator) {
            case '+':
                return adder();
            case '-':
                return subtractor();
            case '*':
                return multiplier();
            case '/':
                return divider();
            case '%':
                return modulus();
            default:
                return -1;
        }
    }

    private double adder()
    {
        return this.firstUserInput + this.secondUserInput;
    }

    private double subtractor() {
        return this.firstUserInput - this.secondUserInput;
    }

    private double multiplier() {
        return this.firstUserInput * this.secondUserInput;
    }

    private double divider() {
        return this.firstUserInput / this.secondUserInput;
    }

    private double modulus() {
        return this.firstUserInput % this.secondUserInput;
    }
}
