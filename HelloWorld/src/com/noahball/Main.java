package com.noahball;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Reference types - simple data

        byte myAge = 30; // Bytes store numbers up to 127
        long viewsCount = 3_123_456_789L; // Longs store large numbers. Can be separated with _ for simplicity/readability but does not affect the final result. Use a suffix - L. As Java thinks all numbers are integers, the L stands for long, making Java read it as a long.
        float price = 10.99F; // Float - decimals. Once again, use the suffix F - as it stands for float as Java reads all numbers as integers, which do not support decimals. By using F (suffix) it makes Java read it as a float.
        char letter = 'A'; // Pretty simple. A single character. In Java all single characters are surrounded by single quotes - ' NOT double quotes - "
        boolean isEligible = false;
        byte herAge = myAge; // Variables can equal other variables
        System.out.println(myAge); // Print a variable

        // Primitive types - complex data
        // Primitive types are completely independent of each other
        Date now = new Date(); // Objects of a class
        System.out.println(now); // Print an object, in this case the current time

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y); // You will see that the variable "y" hasn't changed, even though x has. This is because these variables are independent of each other, and do not dynamically sync.

        Point point1 = new Point(x, y); // Objects with parameters
        Point point2 = point1; // Objects act like variables in a way... they can be the same as each other.
        point1.x = 2;
        System.out.println(point2);

        // Strings
        // Pretty self-explanatory
        String message = "Hello World";
        String lookFor = "World";
        System.out.println(message);
        System.out.println(message + ", you are amazing!"); // Basically concatenation and most work with strings is the same as C#
        System.out.println("The myth that the string " + message + " ends with " + lookFor + " has finally been solved, it is "+ message.endsWith(lookFor) + "!"); // Okay, this is actually identical to C# :joy:
        System.out.println("The string " + message + " is " + message.length() + " characters long.");

    }
}
