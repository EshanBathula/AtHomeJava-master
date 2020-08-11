package com.eshan;

import java.util.Arrays;

public class Lesson8Arrays {
    public static void main(String[] args){
        int[] numbers = new int[5];//array is reference type, specify size of array in the second bracket
        numbers[0] = 1;//number inside bracket is the index value
        numbers[1] = 2;
        System.out.println(numbers);//java returns the string which is calculated based on the address of the abject in memory
        int[] numbers2 = new int[5];
        numbers2[0] = 3;
        numbers2[1] = 4;
        System.out.println(Arrays.toString(numbers2)); //Arrays class has methods that convert the array to a string so that the contents of the array can be printed
        int[] numbers3 = {5,9,4,1,7}; //better way to put values into an array if values are known beforehand
        System.out.println(numbers3.length); //array.length returns the length of the array
        //arrays have a fixed length
        Arrays.sort(numbers3);//puts numbers in numerical order
        System.out.println(Arrays.toString(numbers3));
    }
}
