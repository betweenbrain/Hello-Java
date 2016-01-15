package com.betweenbrain;

public class Main {

    public static void main(String[] args) {

        // Char has width of 16 (2 bytes),
        // Can be only one character or unicode code (http://unicode-table.com)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        // Only true or false
        boolean isTrue = true;
        boolean isFalse = false;
    }
}
