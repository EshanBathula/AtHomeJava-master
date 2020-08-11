package com.eshan;

import java.text.NumberFormat;

public class Lesson15FormattingNumbers {
    public static void main(String[] args){
        //NumberFormat currency = new NumberFormat();//cant create instance of NumberFormat because it is abstract class
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234123.912);//formats it in the form of currency
        System.out.println(result);
        String result2 = NumberFormat.getPercentInstance().format(0.7621);//this is called method chaining
        //returns it as percentage
        System.out.println(result2);
    }
}
