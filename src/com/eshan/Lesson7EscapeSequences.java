package com.eshan;

public class Lesson7EscapeSequences {
    public static void main(String[] args){
        String message = "Hello \"Eshan\""; //must prefix special characters with a backslash to avoid compilation errors
        System.out.println(message);
        String message2 = "c:\\Windows\\";//must use double backslash when you want a backslash in your string
        System.out.println(message2);
        String message3 = "Line 1\n Line 2";//use \n to put following text on a new line
        System.out.println(message3);
        String message4 = "There will be a tab now \t This is after the tab";//use \t to input a tab into a string
        System.out.println(message4);
    }
}
