/**
 * Project    HelloWorld
 * Created    1/12/16 1:43 PM
 * Author     Matt Thomas | matt@betweenbrain.com | http://betweenbrain.com
 * Copyright  Copyright (C) 2016 betweenbrain llc. All Rights Reserved.
 * License    GNU GPL v2 or later
 */

public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber =  myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int diff = 1000 - myTotal;

        System.out.println(diff);
    }
}
