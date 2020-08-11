package com.eshan;

import java.text.NumberFormat;
import java.util.Scanner;

public class Unit2Lesson14ProjectMortgageCalculator {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principalAmount;
        float interest;
        float years;

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Principal: ");
            principalAmount = scanner.nextInt();
            if (principalAmount >= 1000 && principalAmount <= 1000000){
                break;
            }
            System.out.println("Please enter a value between 1,000 and 1,000,000");
        }

        Scanner scanner2 = new Scanner(System.in);
        while(true) {
            System.out.print("Annual Interest Rate: ");
            interest = scanner2.nextFloat();
            if (interest > 0 && interest <= 30){
                break;
            }
            System.out.println("Please enter a value greater than 0 and less than or equal to 30.");
        }

        Scanner scanner3 = new Scanner(System.in);
        while(true) {
            System.out.print("Period (Years): ");
            years = scanner3.nextInt();
            if (years > 1 && years < 30){
                break;
            }
            System.out.println("Please enter a value between 1 and 30");
        }

        float interestRate = interest/ MONTHS_IN_YEAR / PERCENT;
        double fractionTop = interestRate * Math.pow(1 + interestRate, years * MONTHS_IN_YEAR); //this is
        double fractionBottom = Math.pow(1 + interestRate, years * MONTHS_IN_YEAR) - 1;        //the formula
        double mortgage = principalAmount * (fractionTop/fractionBottom);                     //for calculating mortgage

        String mortgageAmountFormatted = NumberFormat.getCurrencyInstance().format(mortgage); //converts it to currency
        System.out.println("Your monthly payment for the next " + (int)years + " years is " + mortgageAmountFormatted);
    }
}
