package com.qa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Give me a number to play the game FIZZBUZZ: ");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        for(int i = 0; i <= max; i ++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FIZZBUZZ");
            }
            else if (i % 3 == 0)
            {
                System.out.println("FIZZ");
            }
            else if (i % 5 == 0)
            {
                System.out.println("BUZZ");
            }
            else
            {
                System.out.println(i);
            }


        }
    }
}
