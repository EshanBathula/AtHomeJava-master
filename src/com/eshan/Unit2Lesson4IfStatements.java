package com.eshan;

import java.util.Scanner;

public class Unit2Lesson4IfStatements {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's the temperature today? ");
        int temp = scanner.nextInt();

        if(temp > 30){
            System.out.println("It's a hot day today, drink lots of water");
        } else if (temp > 20 && temp <= 30){
            System.out.println("It's a beautiful day.");
        } else {
            System.out.println("It's cold today");
        }

    }
}
