package org.example;

public class Loops {
    public static void main(String[] args) {
        // repeat that line 100 times

        System.out.println("Let's play with loops");

        // while loop is going to be executed as lng the condition is true
        // infinite loop

//        while (true) {
//           System.out.println("Let's play with loops");
//       }

        int numberOfRepetitions = 10;
        while (numberOfRepetitions > 0) {
            System.out.println("Loop is running, number of repetitions is: " + numberOfRepetitions);

            //numberOfRepetitions = numberOfRepetitions -1;
            numberOfRepetitions--;

            // numberOfRepetitions = numberOfRepetitions -2;
            // numberOfRepetitions--;
        }
        System.out.println("After loop");
        System.out.println("Number of repetitions is: " + numberOfRepetitions);

    }
}
