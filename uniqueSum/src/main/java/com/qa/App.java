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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int num1 = scanner.nextInt();
        System.out.println("Give a number");
        int num2 = scanner.nextInt();
        System.out.println("Give a number");
        int num3 = scanner.nextInt();

        int[] array = new int[3];
        array[0] = num1;
        array[1] = num2;
        array[2] = num3;

        int total = num1 + num2 + num3;
        int deduction = 0;

        boolean isUnique = true;


        for(int i = 0; i < array.length; i++)
        {
            int store = array[i];
            for(int j = 0; j < array.length; j++)
            {
                if(array[j] == store && j != i)
                {
                    isUnique = false;
                    deduction = array[i];
                }
            }
            if(!isUnique)
            {
                total -= deduction;
            }
            isUnique = true;
        }

        System.out.println("Answer is: " + (total));


    }
}
