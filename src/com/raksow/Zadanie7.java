package com.raksow;

import java.util.Scanner;

public class Zadanie7
{
    public static void wykonaj()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wspolrzedne x1, y1 i x2, y2");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        int a = (x2 - x1);
        int b = (y2 - y1);

        int c2 = (int) (Math.pow(a, 2) + Math.pow(b, 2));

        float wynik = (float) Math.sqrt(c2);
        System.out.println("Odleglosc pomiedzy punktami = " +wynik);
    }
}
