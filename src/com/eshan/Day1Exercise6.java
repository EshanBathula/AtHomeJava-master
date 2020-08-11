package com.eshan;
import java.util.Scanner;

public class Day1Exercise6{
    public static void main(String[] args){
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int x = in1.nextInt();

        System.out.print("Enter your second number: ");
        int y = in1.nextInt();

        System.out.println(x +"+"+ y +"="+ x+y);
    }
}