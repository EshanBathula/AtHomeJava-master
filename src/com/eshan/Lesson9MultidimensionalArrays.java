package com.eshan;

import java.util.Arrays;

public class Lesson9MultidimensionalArrays {
    public static void main(String[] args){
        int[][] numbers = new int[2][3];//matrix has 2 rows 3 columns
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));//use deepToString when dealing with multi-dimensional arrays
        int [][] numbers2 = { {1,2,3},{4,5,6} };//easier way to input predetermined values into multidimensional array
        System.out.println(Arrays.deepToString(numbers2));
    }
}
