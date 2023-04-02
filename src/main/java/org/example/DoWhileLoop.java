package org.example;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Now - let's play with do while loop");

        do {
            System.out.println("Condition is false :)");
        } while (false);

        System.out.println("Let's read input from user");
        Scanner inputReader = new Scanner(System.in);

        int userInput;

        do {
            System.out.println("Provide some number: ");
            userInput = inputReader.nextInt();
        } while (userInput != 5);
        //
        // generate random number
        Random numberGenerator = new Random();
        System.out.println("some random number: " + numberGenerator.nextInt());
        System.out.println("some random number: " + numberGenerator.nextInt(5));


    }
}
