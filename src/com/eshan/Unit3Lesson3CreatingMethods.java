package com.eshan;

public class Unit3Lesson3CreatingMethods {
    public static void main(String[] args){
       String message = greetUser("Eshan", "Bathula");
        System.out.println(message);
    }

    public static String greetUser(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;
    }

}
