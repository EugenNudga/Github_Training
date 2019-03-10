package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int i0= 0;
        System.out.println(String.format("%d", i0));
        int i1 = 1;
        System.out.println(String.format("%d", i1));

        while(true)
        {
            int i2 = i1 + i0;
            System.out.println(String.format("%d", i2));
            i0 = i1;
            i1 = i2;
        }

    }
}
