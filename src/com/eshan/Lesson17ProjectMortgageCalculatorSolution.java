package com.eshan;

import java.text.NumberFormat;

import java.util.Scanner;

public class Lesson17ProjectMortgageCalculatorSolution {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principalAmount = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        float interest = scanner2.nextFloat();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Period (Years): ");
        float years = scanner3.nextInt();

        float interestRate = interest/ MONTHS_IN_YEAR / PERCENT;
        double fractionTop = interestRate * Math.pow(1 + interestRate, years * MONTHS_IN_YEAR); //this is
        double fractionBottom = Math.pow(1 + interestRate, years * MONTHS_IN_YEAR) - 1;        //the formula
        double mortgage = principalAmount * (fractionTop/fractionBottom);                     //for calculating mortgage

        String mortgageAmountFormatted = NumberFormat.getCurrencyInstance().format(mortgage); //converts it to currency
        System.out.println("Your monthly payment for the next " + (int)years + " years is " + mortgageAmountFormatted);
    }
}
