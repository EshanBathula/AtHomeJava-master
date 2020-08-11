package com.eshan;

public class Lesson13Casting {
    public static void main(String[] args){
        short x = 1; //short is 16 bits. All value stored in short variable can be stored in int
        int y = x+2; //int is 32 bits
        //java looks at the x in the y value and allocates a mysterious space for it as an int.
        //Java then copies the x value from the short and puts it into the int and adds the two numbers together
        //This is called implicit casting(when things are automatically converted or casted
        System.out.println(y);
        double a = 1.1;
        double b = a + 2;//java automatically casts the 2 as 2.0 and adds it to 1.1
        //byte > short > int > long > float > double
        //implicit casting only occurs when there is no chance of data loss
        System.out.println(b);
        double n = 2.1;
        int m = (int)n + 2;//We convert x to an integer so that we get an integer as a result
        //Explicit casting
        System.out.println(m);
        //cannot cast String to a number
        String c = "1";
        int i = Integer.parseInt(c) + 8;//this method takes a string and returns an integer
        //Integer can be replaced with Short, Float, Double, etc.
        System.out.println(i);
    }
}
