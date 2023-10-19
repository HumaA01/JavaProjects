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

        System.out.println("Would you like to use the calculator: (Y/N)");
        String reply = scanner.next();
        char r = reply.charAt(0);

        while(r == 'Y' || r == 'y')
        {
            System.out.println("Give a number");
            int num1 = scanner.nextInt();
            System.out.println("Give a number");
            int num2 = scanner.nextInt();

            System.out.println("Give an operator: (+, -, *, /)");
            String operator = scanner.next();

            switch (operator) {
                case "*":
                    System.out.println("You chose to multiply both numbers!");
                    System.out.println("The result is: " + (num1 * num2));
                    break;
                case "+":
                    System.out.println("You chose to add both numbers!");
                    System.out.println("The result is: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("You chose to subtract both numbers!");
                    System.out.println("The result is: " + (num1 - num2));
                    break;
                case "/":
                    System.out.println("You chose to divide both numbers!");
                    System.out.println("The result is: " + (float) (num1 / num2));
                    break;
                default:
                    System.out.println("You have not given a valid operator");
                    break;
            }

            System.out.println("Would you like to use the calculator: (Y/N)");
            reply = scanner.next();
            r = reply.charAt(0);

        }




    }
}
