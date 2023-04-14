package org.example;

public class Calculator {
    public static void main(String[] args) {

        //addition
        int result1 = addTwoNumbers(3, 5);
        int result2 = addTwoNumbers(10, 20);

        System.out.println("result1 is: " + result1);
        System.out.println("result 2 is: " + result2);
        System.out.println("Sum of results is: " + (result1 + result2));

        //subtraction
        result1 = subTwoNumbers(3, 5);
        result2 = subTwoNumbers(10, 20);

        System.out.println("Result1 is: " + result1);
        System.out.println("Result2 is: " + result2);
        System.out.println("Subtraction of results is: " + (result1 - result2));

        //multiplication
        result1 = multiplyTwoNumbers(3, 5);
        result2 = multiplyTwoNumbers(10, 20);

        System.out.println("Result1 is: " + result1);
        System.out.println("Result2 is: " + result2);
        System.out.println("Multiplication of results is: " + (result1 * result2));

        //division
        result1 = divTwoNumbers(5, 10);
        result2 = divTwoNumbers(2, 20);

        System.out.println("Result1 is: " + result1);
        System.out.println("Result2 is: " + result2);
        System.out.println("Division of results is: " + (result2 / result1));


    }

    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println("I'm going to add two numbers");
        int result = firstNumber + secondNumber;
        System.out.println("Final result is: " + result);
        return result;
    }

    public static int subTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println("I'm going to sub two numbers");
        int result = secondNumber - firstNumber;
        System.out.println("Final result is: " + result);
        return result;
    }

    public static int multiplyTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println("I'm going to multiply two numbers");
        int result = secondNumber * firstNumber;
        System.out.println("Final result is: " + result);
        return result;
    }

    public static int divTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println("I'm going to divide two numbers");
        int result = secondNumber / firstNumber;
        System.out.println("Final result is: " + result);
        return result;
    }
}

