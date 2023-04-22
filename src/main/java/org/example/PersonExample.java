package org.example;

public class PersonExample {
    public static void main(String[] args) {
        System.out.println("Let's play with objects!");

        Person andressa = new Person();
        Person gustavo = new Person();
        gustavo.name = "gustavo";


        System.out.println("andressa name is: " + andressa.name);
        andressa.name = "andressa";
        andressa.surname = "stabelini";
        andressa.age = 28;

        System.out.println("Object after assigning some values");
        System.out.println("andressa.name is " + andressa.name);
        System.out.println("andressa.address is: " + andressa.personAddress);
        System.out.println("gustavo.name is " + gustavo.name);

        String person1Name;
        String person1Surname;
        int person1age;

    }
}
