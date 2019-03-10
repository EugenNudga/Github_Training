package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("hi");
        int first= 0;
        System.out.println(String.format("%d", first));
        int i1 = 1;
        System.out.println(String.format("%d", i1));

        while(true)
        {
            int i2 = i1 + first;
            System.out.println(String.format("%d", i2));
            first = i1;
            i1 = i2;
        }

    }
}
