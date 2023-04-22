package org.example;
public class Person {
     String name;
     String surname;
     int age;
     Address personAddress;
     Phone phoneNumber;
     public Person(String name, String surname, int age, Address personAddress, Phone phoneNumber) {
          this.name = name;
          this.surname = surname;
          this.age = age;
          this.personAddress = personAddress;
          this.phoneNumber = phoneNumber;
     }
     public Person(String name, String surname, int age) {
          this.name = name;
          this.surname = surname;
          this.age = age;
     }

     @Override
     public String toString() {
          return "Person{" +
                  "name='" + name + '\'' +
                  ", surname='" + surname + '\'' +
                  ", age=" + age +
                  ", personAddress=" + personAddress +
                  ", phoneNumber=" + phoneNumber +
                  '}';
     }

     // default constructor - no arguments
     // it's like a function/method
     // no return type
     // named like a class
     public Person() {
     }
}