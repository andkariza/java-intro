package org.example;
public class Address {
    String country;
    String city;
    String street;
    String flatNumber;
    String zipCode;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    public Address() {
    }
    public Address(String country, String city, String street, String flatNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.flatNumber = flatNumber;
        this.zipCode = zipCode;
    }
}
