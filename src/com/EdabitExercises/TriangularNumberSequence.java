package com.EdabitExercises;

import java.util.Scanner;

public class TriangularNumberSequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Row of Pascal's Triangle: ");
        int row = scanner.nextInt();

        System.out.print("Sum of all numbers is " + PascalTriangle.triangle(row));
    }
}
