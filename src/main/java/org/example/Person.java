package org.example;

public class Person {
     public Person(String name, String surname, int age, Address personAddress, Phone phoneNumber) {
          this.name = name;
          this.surname = surname;
          this.age = age;
          this.personAddress = personAddress;
          this.phoneNumber = phoneNumber;
     }
     //defaut constructor - no argument
     // it's like a function
     // no retur type
     //named like a class
     public Person() {
     }

     String name;
     String surname;
     int age;

     Address personAddress;
     Phone phoneNumber;


    
}
