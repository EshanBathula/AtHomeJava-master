package com.eshan;

public class Lesson14TheMathClass {
    public static void main(String[] args){
       int result = Math.round(1.1F);//rounds it to int
       System.out.println(result);
       int result2 = (int)Math.ceil(1.1F);//since Math.ceil returns a double we have to explicitly cast it as an int
       //Math.ceil returns the greatest number the argument is closest too
       System.out.println(result2);
       int result3 = Math.max(1,2);//returns larger of the two
       System.out.println(result3);
       int result4 = (int)Math.round(Math.random() * 100);
       //round method returns a long so we have to explicitly cast as into to remove decimal values
       System.out.println(result4);
    }
}
