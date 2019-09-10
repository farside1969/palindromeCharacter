package com.company;

// import necessary tools
import java.util.Scanner;

// create class
public class PalindromeCharacter {

// create method
    public static void main(String[] args) {

// declare
        String a;
        String b="";
// unnecessary personal secondary Strings for later use
        /*
        * String c;
        * String d;
        */

// create scanner
        Scanner in = new Scanner(System.in);

// user input
        System.out.println("Please enter characters or integers in amy combination to verify if they are a palindrome or not: ");

// iterate user input "a" in forward direction
// String a is ready for comparison at this point
        a = in.nextLine();

// unnecessary personal secondary inputs for secondary user output statements
        /*
        * System.out.println("If your input is a Palindrome, what do you want to say about it? ");
        * c = in.nextLine();
        * System.out.println("If your input is not a Palindrome, what do you want to say about it? ");
        * d = in.nextLine();
        */

// create integer "length" for use with String "b"
        int length = a.length();

// create for loop to iterate "b" in reverse direction
        for (int i = length - 1; i>=0; i--)
// use charAt to convert integer "b" into string "b" for comparison later
            b = b + a.charAt(i);

// conditional statement to compare string "a" to string "b"
        if(a.equals(b))
            System.out.println(a + " is a palindrome");
        else
            System.out.println(a + " is not a palindrome");

// unnecessary secondary user outputs
        /*
        * if (a.equals(b))
        *     System.out.println(c);
        * else
        *     System.out.println(d);
        */
    }
}
