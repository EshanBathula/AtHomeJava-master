package com.EdabitExercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        StringBuilder reversed = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullString = scanner.nextLine();

        StringBuilder reverse = new StringBuilder();

        for(int i = fullString.length()-1; i >= 0; i--){
          reversed = reverse.append(fullString.charAt(i));
        }
        System.out.println(reversed);
    }
}
