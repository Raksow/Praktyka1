package com.raksow;

import java.util.Scanner;

public class Zadanie4
{
    public static void wykonaj()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj boki trojkata by sprawdzic czy jest poprawny: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if((a + b > c) && (a + c > b) && (b + c > a))
        {
            System.out.println("tak");
        }
        else
        {
            System.out.println("nie");
        }
    }
}
