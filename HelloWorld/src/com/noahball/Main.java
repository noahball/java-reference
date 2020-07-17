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
        String lookForChar = "l";
        String find = "Hello";
        String replace = "Howdy";
        String messageTrim = "   Hello World!  ";
        System.out.println(message);
        System.out.println(message + ", you are amazing!"); // Basically concatenation and most work with strings is the same as C#
        System.out.println("The myth that the string " + message + " ends with " + lookFor + " has finally been solved, it is "+ message.endsWith(lookFor) + "!"); // Okay, this is actually identical to C# :joy:
        System.out.println("The string " + message + " is " + message.length() + " characters long.");
        System.out.println("The character(s) " + lookForChar + " are in the following locations in the string " + message + ": " + message.indexOf(lookForChar)); // Return the location(s) of character(s) in a string. Once again this is very similar to C#.
        System.out.println("Replacing the character(s) \"" + find + "\" in the string \"" + message + "\" with \"" + replace + "\" returns the string \"" + message.replace(find, replace) + "\"!"); // Finding and replacing character(s) in a string. Use a \ before quotes for Java to ignore it and not break the string.
        System.out.println(message); // For obvious reasons finding and replacing does NOT modify the original string.
        System.out.println("The string \"" + message + "\" converted to lowercase is \"" + message.toLowerCase() + "\"!"); // Converting strings to all lowercase. Once again, this is literally identical to C#!
        System.out.println("The string \"" + message + "\" converted to uppercase is \"" + message.toUpperCase() + "\"!"); // Converting strings to all uppercase. Once again, this is literally identical to C#!
        System.out.println("The string \"" + messageTrim + "\" with all unneeded spaces removed is \"" + message.trim() + "\"!"); // Removing all unneeded spaces, good if a user fills out a form and they accidentally add more spaces than needed

        // Escape Sequences
        System.out.println("This string has \"escaped double quotes\" in it!"); // Haha, I bet the tutorial and figured out how to escape quotes before they were even mentioned!
        System.out.println("C:\\Windows\\system32\\..."); // Escaping back slashes, else you have the domino-effect and it escapes the quotes, leading to a broken program.
        System.out.println("Step 1: ...\nStep 2: ...\nStep 3: ..."); // Skipping lines... just like JavaScript!
        System.out.println("We\tlove\ttabs!"); // Tabs

    }
}
