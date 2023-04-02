package org.example;

public class MyFirstJavaMethod {

    public static
    // function has got name: main
    // function needs some input parameters  - located inside braces e.g. String [] args
    // return type (result) - e.g. void - at the begging of the method signature public static void main(String[] args)
    void main(String[] args) {
        //call method using its name
        describeMe();
        System.out.println("one");
        describeMe();
        System.out.println("two");
        describeMe();
    }

    public static void describeMe() {
        System.out.println("Hi, I'm Andressa");
        System.out.println("I'm QA student");
    }
}
