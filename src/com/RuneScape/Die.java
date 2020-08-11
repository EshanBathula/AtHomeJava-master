package com.RuneScape;


import java.lang.reflect.Array;

public class Die
{
    int value;

    public int dieRoll()
    {
        value = (int)(Math.random()*6) + 1;
        return value;
    }
    public static void main(String[] args)
    {
       Die d = new Die();
       int value=0;
       for (int i = 0; i < 10; i++)
        {
            System.out.print("Old value:" + value + " ");
            value = d.dieRoll();
            System.out.println("Current Value: " + value);
        }
    }

}
