package com.EdabitExercises;

import java.util.Scanner;

public class ShuffleName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        System.out.println(names[1] +" " + names[0]);

    }
}
