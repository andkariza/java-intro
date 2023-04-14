package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        System.out.println("hey, guess a number between 0 to 10: ");
        Scanner inputReader = new Scanner(System.in);
        int userInput;

        Random numberGenerator = new Random();
        int randomNumber = numberGenerator.nextInt(11);
        int retry = 0;

        do {
            if (retry > 0) {
                System.out.println("Try again!");
            } else {
                System.out.println("Write a number: ");
            }
            retry = retry + 1;
            userInput = inputReader.nextInt();
        } while (userInput != randomNumber);

        System.out.println("You got it. Congrats! You needed " + retry + " retries!" );
    }
}
