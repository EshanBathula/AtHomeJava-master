package com.eshan;

import java.util.Scanner;

public class Unit2Lesson10WhileLoops {
    public static void main(String[] args){
            //while loops are better when we dont know how many times code needs to be executed
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        }
    }

