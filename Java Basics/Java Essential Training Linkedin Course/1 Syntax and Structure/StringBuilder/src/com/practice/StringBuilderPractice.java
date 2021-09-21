package com.practice;

import java.util.Scanner;

public class StringBuilderPractice {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!");
        String builderToString = sb.toString();
        System.out.println(builderToString);

           StringBuilder b = new StringBuilder();

        System.out.println("Enter the first Value  :  ");

           Scanner scanner = new Scanner(System.in);
           String input1 = scanner.nextLine();

        System.out.println("Enter the Second Value  :  ");
           String input2 = scanner.nextLine();

        b.append(input1).append(", ").append(input2);

        System.out.println(b);

        String primitiveHelloString = "hello";
        String primitiveHelloStringCopy = "hello";

        /*
        *  In here the primitiveHelloString and primitiveHelloStringCopy is the same object,
        * this is actually done by java, since an object of same value already exists, the new value
        * points to the existing object by reference.
        *
        * So using the equality operator both the String objects are same, so the operation returns true
        *
        * */

        if(primitiveHelloStringCopy == primitiveHelloString){
            System.out.println("primitive Values Match");
        }
        else {
            System.out.println("primitive values Don't Match");
        }

        String stringClassHello = new String("Hello");
        String stringClassHelloCopy = new String("Hello");

        if(stringClassHello == stringClassHelloCopy)
        {
            System.out.println("stringHelloClass values match");
        }
        else{
            System.out.println("StringHelloClass values don't match");
        }

        /*
        *
        * In here we are forcing a new object creation using the new operator, so both the objects
        * are different, even if the value in the objects are same.
        *
        * So in here the comparison using the equality operator don't work, because both the objects
        * are different.
        *
        * So, it is always recommended using the 'equals' operator of the Strings class to compare Strings,'
        * because then it returns true, if both the value passed in the object are same, even if the objects
        * are not same.
        * */


        if(stringClassHello.equals(stringClassHelloCopy)){
            System.out.println("stringHelloClass using equals operator match");
        }
        else {
            System.out.println("stringHelloClass using equals operator don't match");
        }


    }
}
