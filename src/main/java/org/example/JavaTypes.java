package org.example;

public class JavaTypes {
    public static void main(String[] args) {
        // System.out.printLn - use it for printing data to console
        System.out.println("Java Types");

        // put anything inside comments
        // base java types
        // for numbers
        // int is for storing just numbers
        // age is variable

        int age = 7;
        System.out.println(age);
        age = 14;
        System.out.println(age);

        // age = "andressa"; wrong code (only numbers) [ex. 1,2,3...]

        String myName = "Andressa";
        System.out.println(myName);
        String secondName = "Kariza";
        System.out.println(secondName);

        System.out.println("My name is: " + myName);
        System.out.println("My second name is: " + secondName);

        String surname = "Stabelini";
        System.out.println("My surname is: " + surname);

        // I'm name - surname

        System.out.println("I'm " + myName + " " + secondName + " " + surname);

        System.out.println("Now let's play with characters");
        // char is for storing just a single characters
        char singleLetter = 'a';

        String singleLetterString = "a";

        System.out.println("Minimum int number is: " + Integer.MIN_VALUE);
        System.out.println("Maximum int number is: " + Integer.MAX_VALUE);

        // long
        long biggerNumber = 1;
        System.out.println("Minimum long number is: " + Long.MIN_VALUE);
        System.out.println("Maximum long number is: " + Long.MAX_VALUE);

        // short
        short smallNumber = 1;
        System.out.println("Minimum short number is: " + Short.MIN_VALUE);
        System.out.println("Maximum short number is: " + Short.MAX_VALUE);

        //byte
        byte bytenumber = 1;
        System.out.println("Minimum byte number is: " + Byte.MIN_VALUE);
        System.out.println("Maximum byte number is: " + Byte.MAX_VALUE);

        //boolean
        boolean trueOrFalse = true;
        trueOrFalse = false;
        System.out.println("boolean variable current value: " + trueOrFalse);

        age = 15;
        boolean isAdult = age > 18;
        System.out.println("isAdult current value: " + isAdult);


    }
}
