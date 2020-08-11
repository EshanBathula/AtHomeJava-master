package com.eshan;

import java.text.NumberFormat;
import java.util.Scanner;


public class Lesson17ProjectMortgageCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int amount = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        double interest = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Period (Years): ");
        double years = scanner3.nextInt();

        double rate = interest/1200;
        double fractionTop = rate * Math.pow(1+rate, years*12);
        double fractionBottom = Math.pow(1+rate, years*12) - 1;
        double mortgage = amount * (fractionTop/fractionBottom);

        String mortgageAmount = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageAmount);
    }
}
