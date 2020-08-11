package com.JavaCourse2;

public class Main {
    public static void main(String[] args){
        TextBox textBox = new TextBox();
        textBox.setText("Box 1");
        System.out.println(textBox.text);

        TextBox textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text.toUpperCase());

        textBox.clearText();

        System.out.println(textBox.text + "Cleared");
    }
}
