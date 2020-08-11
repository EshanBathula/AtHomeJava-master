package com.EdabitExercises;

import java.util.Scanner;

public class CheckIfStringEndingMatchesSecondString {
    public static void main(String[] args){
        CheckEnding check = new CheckEnding();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first string: ");
        String string1 = scanner.next();

        System.out.print("Enter your second string: ");
        String string2 = scanner.next();

        System.out.println();

        //check.checkStrings(string1, string2);
        System.out.println(check.compareStrings(string1,string2));


    }
}
