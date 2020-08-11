package com.eshan;

import java.util.Scanner;

public class Unit2Lesson5SimplifyingIfStatements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your income? ");
        int income = scanner.nextInt();

        boolean hasHighIncome = (income > 100000); //this is much better way to implement boolean and if statement

        if(hasHighIncome){
            System.out.println("You have a high income.");
        } else {
            System.out.println("You have a low income");
        }

    }
}
