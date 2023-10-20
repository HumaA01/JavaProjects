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
        System.out.println("What is your salary? ");
        double salary = scanner.nextInt();
        double taxTotal = 0;
        taxTotal = taxCalc(salary);
        System.out.println("You will pay £" + taxTotal + " in tax.");
        System.out.println("Your take home amount is: £" + (salary - taxTotal));
    }

    public static double taxCalc(double salary)
    {
        double taxTotal = 0;

        if(salary <= 14999)
        {
            taxTotal += 0;
        }

        if(salary > 14999)
        {
            taxTotal += bracket2(salary);
        }
        if(salary > 19999)
        {
            taxTotal += bracket3(salary);
        }
        if(salary > 29999)
        {
            taxTotal += bracket4(salary);
        }

        if(salary >= 45000)
        {
            taxTotal += (salary - 45000)*0.25;
        }


        return taxTotal;
    }

    public static double bracket2(double salary)
    {
        double total = 0;
        if (salary >= 14999 && salary <= 19999)
        {
            total = (salary - 15000)*0.1;
        }
        else if (salary > 19999)
        {
            total = ((19999 - 15000)*0.1);
        }

        return total;
    }

    public static double bracket3(double salary)
    {
        double total = 0;
        if (salary >= 19999 && salary <= 29999)
        {
            total = (salary - 20000)*0.15;
        }
        else if (salary > 29999)
        {
            total = ((29999 - 20000)*0.15);
        }

        return total;
    }

    public static double bracket4(double salary)
    {
        double total = 0;

        if (salary >= 29999 && salary <= 44999)
        {
            total = (salary - 30000)*0.2;
        }
        else if (salary > 44999)
        {
            total = ((44999 - 30000))*0.2;
        }

        return total;
    }


}
