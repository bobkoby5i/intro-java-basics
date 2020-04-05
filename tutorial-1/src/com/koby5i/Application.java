package com.koby5i;

public class Application {

    public static void main(String[] args) {
	// write your code here
        int    myVariable = 88;
        short  myShort = 12;
        long   myLong  = 123445;

        double myDouble = 123.1234/3;
        float  myFloat = 12.34f;

        char   myChar = 'A';
        boolean myBoolean= false;

        byte    myByte = 10;


        System.out.println("Hello World:" + myVariable);
        System.out.println("Hello World:" + myShort);
        System.out.println("Hello World:" + myLong);
        System.out.println("Hello World:" + myDouble);
        System.out.println("Hello World:" + myFloat);
        System.out.println("Hello World:" + myChar);
        System.out.println("Hello World:" + myBoolean);
        System.out.println("Hello World:" + myByte);

        int myInt = 7;
        String text = "Hello";
        String blank = " ";
        String name = "Bob";
        String greeting = text + blank + name;
        System.out.println(greeting);
        System.out.println("Hello" + " " + "Bob");
        System.out.println("My integer is: " + myInt);

        double myDouble2 = 7.8;
        System.out.println("My number is: " + myDouble2 + ".");

        int value = 0;
        while (value < 10) {
            System.out.println("Value is = " + value);
            value = value + 1;
        }
        int i;
        for (i=1;i<=2;i++)
            System.out.printf("Value of i is = %03d\n",i);
    }
}
