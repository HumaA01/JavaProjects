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
        System.out.println("Give me a number 1-12:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch(num) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("You haven't given a value 1-12");
        }


    }
    public static void t1()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int num1 = scanner.nextInt();
        System.out.println("Give a number");
        int num2 = scanner.nextInt();

        if(num1 > num2)
        {
            System.out.println(num1+ " is greater than " + num2);
        }
        else
        {
            System.out.println(num2 + " is greater than or equal to " + num1);
        }

        System.out.println("Give me another number");
        int num3 = scanner.nextInt();

        if(num3 % 2 == 0)
        {
            System.out.println("That is an even number");
        }
        else
        {
            System.out.println("That is an odd number");
        }

        System.out.println("Give me a traffic light colour: R/A/G");
        String light = scanner.next();

        if(light.equals("red")|| light.equals("Red"))
        {
            System.out.println("Red means stop");
        }
        else if(light.equals("amber")|| light.equals("Amber"))
        {
            System.out.println("Yellow means get ready or slow down");
        }
        else if(light.equals("Green") || light.equals("green"))
        {
            System.out.println("Red means stop");
        }

    }
}
