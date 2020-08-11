package com.eshan;

public class Unit2Lesson13ForEachLoop {
    public static void main(String[] args){
        String[] fruits = {"Apple", "Orange", "Plum"};

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
        for (String fruit : fruits){ //has limitations, can only go forward
            //dont have access of the index of each item
            System.out.println(fruit);
        }
    }
}
