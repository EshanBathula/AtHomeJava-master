package com.eshan;

public class Lesson11ArithmeticExpressions {
    public static void main(String[] args){
        //% is modulus or the remainder of division
        int addResult = 10 + 3;
        System.out.println(addResult);
        int subResult = 10 - 3;
        System.out.println(subResult);
        double divResult = (double)10 / (double)3;//prefix everything with double to return a more exact decimal value
        System.out.println(divResult);
        int modResult = 10 % 3;
        System.out.println(modResult);//returns remainder
       int increment = 1;
       int y = increment++;
        System.out.println(increment);
        System.out.println(y);//y = 1 because the value of increment was copied to y first. if the ++ was put before the variable y would also equal 2
       int increment2 = 1;
       increment2 += 2;//can make it -=, *=, or even /=
        System.out.println(increment2);
    }
}
