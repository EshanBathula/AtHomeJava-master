package com.eshan;

public class Lesson6Strings {
    public static void main(String[] args){
        String message = "   Hello World"+"!!  "; //looks like a primitive type but strings are actually reference types

        System.out.println(message.endsWith("!!"));//checks if the string ends with certain characters and returns a boolean value
        System.out.println(message.startsWith("!!"));//checks if the string starts with certain characters and returns a boolean value
        System.out.println(message.length());//checks the length of string and returns the numerical value
        System.out.println(message.indexOf("H"));//checks the index value of the character passed and returns the index value
        System.out.println(message.replace("!", "*"));//replaces the first argument with the second argument
        //all these methods do not modify the original string, they return a new string
        System.out.println(message);
        //strings cannot be mutated or changed in java
        System.out.println(message.toLowerCase());//makes the string all lower case
        System.out.println(message.toUpperCase());//makes the string all upper case
        System.out.println(message.trim());//trims off excess white spaces in the string
    }
}
