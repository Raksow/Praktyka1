package com.raksow;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie6
{
    public static void wykonaj()
    {
        int tab[];
        tab = new int[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 3 liczby: ");
        tab[0] = scan.nextInt();
        tab[1] = scan.nextInt();
        tab[2] = scan.nextInt();

        Arrays.sort(tab);

        for(int i = 0; i < 3; i++)
        {
            System.out.println(tab[i]);
        }
    }
}
