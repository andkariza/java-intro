package org.example;

public class CalculatorII {
    public static void main(String[] args) {
        System.out.println("Using my homework calculator");
        add(10,15);
        addManyNumber(1,1,2,2,1);

    }

    public static int add(int a, int b) {
        System.out.println("Received some parameters, a = " + a + ", b = " + b);
        int result = a + b;
        System.out.println("Calculation result is: " + result);
        return result;
    }
    public static int addManyNumber(int a, int b, int c, int d, int e) {
        System.out.println();
        return 10;
    }



    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

}
