package com.betweenbrain;

public class Main {

    public static void main(String[] args) {

        String myString = "This is my foot";
        System.out.println(myString);
        myString = myString + ", please stop stepping on it";
        System.out.println(myString);
        myString = myString + "\u0021";
        System.out.println(myString);
    }
}
