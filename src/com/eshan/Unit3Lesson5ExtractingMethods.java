package com.eshan;

import java.text.NumberFormat;
import java.util.Scanner;

public class Unit3Lesson5ExtractingMethods {
     final static byte MONTHS_IN_YEAR = 12;
     final static byte PERCENT = 100;
    public static void main(String[] args){
        int principalAmount = (int)readNumber("Principal: ", 1000, 1000000);
        float interest = (float)readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte)readNumber("Period (Years): ", 1, 30);

        float finalMortgage = (float)calculateMortgage(principalAmount, interest, years);
        String mortgageAmountFormatted = NumberFormat.getCurrencyInstance().format(finalMortgage); //converts it to currency
        System.out.println("Your monthly payment for the next " + (int)years + " years is " + mortgageAmountFormatted);

        System.out.println();
        System.out.println("MONTHLY MORTGAGE PAYMENT: " + mortgageAmountFormatted);

        System.out.println();
        System.out.println("MORTGAGE PAYMENT SCHEDULE: ");
        for (short months = 1; months <= years * MONTHS_IN_YEAR; months++){ //int principal, float interest, byte years, short paymentsMade
            double balance = calculateBalance(principalAmount, interest, years, months); //int principal, float interest, byte years, short paymentsMade
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
            //System.out.println(balance);
        }
    }
    public static double readNumber(String prompt, double min, double max){
        Scanner scanner2 = new Scanner(System.in);
        double value;
        while(true) {
            System.out.print(prompt);
            value = scanner2.nextFloat();
            if (value > min && value <= max){
                break;
            }
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
    public static double calculateMortgage(int principalAmount, float interest, byte years){

        float interestRate = interest/ PERCENT/ MONTHS_IN_YEAR;
        double fractionTop = interestRate * Math.pow(1 + interestRate, years * MONTHS_IN_YEAR); //this is
        double fractionBottom = Math.pow(1 + interestRate, years * MONTHS_IN_YEAR) - 1;        //the formula
        double mortgage = principalAmount * (fractionTop/fractionBottom);

        return mortgage;
    }
    public static double calculateBalance(int principal, float interest, byte years, short paymentsMade){

       float interestRate = interest/ PERCENT/ MONTHS_IN_YEAR;
       float numberOfPayments = years * MONTHS_IN_YEAR;

       double balance = principal
               * (Math.pow(1+interestRate, numberOfPayments) - Math.pow(1 + interestRate, paymentsMade))
               / (Math.pow(1+interestRate, numberOfPayments)-1);

       return balance;


    }
}
