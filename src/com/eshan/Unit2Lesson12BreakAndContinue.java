package com.eshan;

import java.util.Scanner;

public class Unit2Lesson12BreakAndContinue {
    public static void main(String[] args){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(true/*simplifies the code by making loop run when true*/){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue; //move control to beginning of loop
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
