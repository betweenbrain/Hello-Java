package com.betweenbrain;

public class Main {

    public static void main(String[] args) {

        // Width of int = 32 (4 bytes), whole number
        int myIntValue = 5 / 3;

        // Width of float = 32 (4 bytes), 7 digits of precision
        float myFloatValue = 5f / 3f;

        // Width of double = 64 (8 bytes), 16 digits of precision
        // Double is faster on many modern computers, used by many Java internals, more precise
        double myDoubleValue = 5d / 3d; // Java will assume double if value has decimal point and no "d"

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
    }
}
