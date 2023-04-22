package org.example;

import java.io.PipedWriter;

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

//        String person1Name;
//        String person1Surname;
//        int person1age;

        System.out.println("phoneNumber code for andressa is: " + andressa.phoneNumber);
        Phone andressaPhone = new Phone();
        andressaPhone.countryCode = "372";
        
        
        andressa.phoneNumber = andressaPhone;
        System.out.println("Country code for andressa is: " + andressa.phoneNumber.countryCode);
        System.out.println("Does it print?");

        System.out.println("Now let's create new person with all the values");
        Person personWithAllFields = new Person();
        personWithAllFields.name = "john";
        personWithAllFields.surname = "snow";
        personWithAllFields.age = 22;
        
        Address johnSnowAddress = new Address();
        johnSnowAddress.country = "Westeros";
        johnSnowAddress.city = "wall";
        johnSnowAddress.street = "n/s";
        johnSnowAddress.flatNumber = "7";
        johnSnowAddress.zipCode = "77777";
        personWithAllFields.personAddress = johnSnowAddress;
        
        Phone johnSnowPhone = new Phone();
        johnSnowPhone.countryCode = "11";
        johnSnowPhone.phoneNumber = "88888888";
        personWithAllFields.phoneNumber = johnSnowPhone;


        Person withConstructor = new Person("Andressa",
                "Stabelini",
                28,
                johnSnowAddress,
                johnSnowPhone);
    }
}
