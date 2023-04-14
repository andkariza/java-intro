package org.example;

public class FunctionExample {
    public static void main(String[] args) {
        String words = "Hi, Welcome to intro to programming!";
        System.out.println("Words before reversing the order of letters: " + words);
        // 1). How to create StringBuilder based n String
        StringBuilder reverseHelper = new StringBuilder(words);

        // 2). How to use reverse operation
        reverseHelper.reverse();

        String revertedWords = reverseHelper.toString();
        System.out.println(revertedWords);

        /*
            No need to use .toString()
            System.out.println(reverseHelper);
         */
    }
}
