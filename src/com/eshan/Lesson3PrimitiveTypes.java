package com.eshan;
//Primitive type variables store numbers, characters, and booleans
//Java sees all whole numbers as int at first
//Java sees all decimals as double at first
public class Lesson3PrimitiveTypes {

    public static void main(String[] args) {


    byte age = 30;//int allocates too much space, use byte instead
    int subscriberCount = 123456789; //use int here because number is <2B and >127
    long viewCount = 3_123_456_789L; /*use long because number >2B; put L at end to
                                       tell computer that it is of the long type*/
    float price = 10.99F;/*use float here because double allocates too much space;
                           put F at end to tell computer that it is a float*/
    char letter = 'A';//char is for single characters; use single quotes
    boolean isEligible = false;//boolean is for true and false

    }
}
