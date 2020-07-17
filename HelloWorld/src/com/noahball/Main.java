package com.noahball;

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
        Date now = new Date(); // Objects of a class
        System.out.println(now); // Print an object, in this case the current time
    }
}
