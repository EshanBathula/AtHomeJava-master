package com.RuneScape;

public class Coin
{

    private static int HEADS = 1;

    private int value = 0;

    public void flip()
    {
        if (Math.random() < 0.5)
        {
            value = 0;
        }
        else
        {
            value = 1;
        }
    }

    public boolean isHeads()
    {
        return value == HEADS;
    }
    public boolean isTails()
    {
        //return value == 0;
        return true;
    }

    public String toString()
    {
        if (value == HEADS)
        {
            return "Heads";
        }
        else
            {
            return "Tails";
            }
    }

    public static void main(String[] args)
    {

        Coin myCoin = new Coin();
        for (int i = 0; i < 10; i++)
        {
            myCoin.flip();
            System.out.println(myCoin);
            System.out.println(myCoin.isHeads());
            System.out.println(myCoin.isTails());
        }
    }
}
