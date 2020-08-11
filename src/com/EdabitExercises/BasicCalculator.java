package com.EdabitExercises;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter mathematical operator: ");
        //String operator = scanner.next();
        String operator = "";
        char op1 = scanner.next().charAt(0);

        System.out.print("Enter your second number: ");
        int secNum = scanner.nextInt();

        BasicCalculator bc = new BasicCalculator();
        System.out.println(bc.calc(firstNum, op1, secNum));
    }
    public int calculator(int num1, String op, int num2){
        int solution = 0;
        if (op.equals('+'))
            solution = num1 + num2;
        else
        if (op.equals('-') )
            solution =  num1 - num2;
        else
        if (op.equals('*'))
            solution = num1 * num2;
        else
        if (op.equals('/'))
            solution = num1 / num2;
        else
        if (op.equals('/') && num2 == 0)
            solution = 0;
        return solution;
    }
    public int calc(int num1, char op, int num2)
    {
        int solution = 0;

        switch(op)
        {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if(num2 == 0)
                {
                return 0;
                }else
                    return num1 / num2;
        }
        return 0;
    }
}
