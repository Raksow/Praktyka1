package com.raksow;

import java.util.Scanner;

public class Zadanie5
{
    public static void wykonaj()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 7");
        int day = scan.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Poniedzialek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piatek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Zla liczba");
                Zadanie5.wykonaj();
        }
    }
}
