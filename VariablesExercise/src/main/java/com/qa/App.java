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
        loopy();


    }

    public static void loops()
    {
        boolean isRaining = true;
        boolean armsHurt = true;

        while(isRaining)
        {
            System.out.println("Hold up umbrella");
            if(armsHurt)
            {
                System.out.println("Arms are too tired, cba holding umbrella");
                break;
            }
        }

        //Continuous loop

        int i = 0;

        do
        {
            System.out.println("Hello");
            i++;
        }
        while (i < 10);


    }

    public static void loopy()
    {
        int sum = 0;
        for(; i < 10; sum += i++); //NOT INITIALISED VALUE i
        System.out.println("Sum is " + sum);
    }

}
