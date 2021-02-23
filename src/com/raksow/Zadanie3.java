package com.raksow;

import java.util.Scanner;

public class Zadanie3
{
    public static void wykonaj()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj stopnie: ");
        float temp = scan.nextFloat();

        float wynik = (float) ((9.0 / 5.0) * temp + 32.0);

        System.out.println(temp + " Stopni C w Fahrenheitach to " +wynik);
    }
}
