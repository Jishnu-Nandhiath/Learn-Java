package com.practice;

import java.util.Scanner;

public class ComplexCalculatorMain {

    public static void main(String[] args) {


        System.out.println("=========== Simple Java Calculator ===========");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first Value  :   ");
        String firstVal = scan.nextLine();
        double userFirstDouble = Double.parseDouble(firstVal);
        System.out.print("Enter the second Value  :   ");
        String secondVal = scan.nextLine();
        double userSecondDouble = Double.parseDouble(secondVal);
        System.out.print("Choose the operation to perform ( * / + - %) :  ");
        String operator = scan.next();

        char operatorChar = operator.charAt(0);

        CalculatorUtility calc = new CalculatorUtility(userFirstDouble,userSecondDouble);

        double result = calc.performOperation(operatorChar);

        if (result == -1) {
            System.out.println("Wrong input ");
        }
        else {
            System.out.printf("the result is  %f ", result);
        }

    }
}
