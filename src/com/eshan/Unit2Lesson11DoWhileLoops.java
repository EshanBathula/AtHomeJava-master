package com.eshan;

import java.util.Scanner;

public class Unit2Lesson11DoWhileLoops {
    public static void main(String[] args){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
        //do while loops always get executed at least once
    }
}
