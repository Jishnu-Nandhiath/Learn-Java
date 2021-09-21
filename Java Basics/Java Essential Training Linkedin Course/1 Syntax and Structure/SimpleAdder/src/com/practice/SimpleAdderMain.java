package com.practice;
import java.util.Scanner;

public class SimpleAdderMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("========== This is a simple Calculator ==========");
        System.out.print("Enter the First Value  :  ");
        double firstUserInput = scan.nextDouble();
        System.out.print("Enter the Second Value  :   ");
        double secondUserInput = scan.nextDouble();

        CalculatorUtility adder = new CalculatorUtility(firstUserInput,secondUserInput);

        System.out.printf("The result is : %f", adder.adder());
    }
}
