package com.eshan;

import java.util.Scanner;

public class Lesson16ReadingInput {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        //use System.in to accept input from terminal
        System.out.print("Age: ");
        byte age = scanner.nextByte();//replace Byte with Float or Double if you want decimals
        System.out.println("You are " + age + " years old.");

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner2.nextLine().trim();//reads the whole entire line
        System.out.println("Your name is " + name);
    }
}
