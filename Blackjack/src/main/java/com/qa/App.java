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
        System.out.println("Give me a number");
        int num1 = scanner.nextInt();
        System.out.println("Give me a number");
        int num2 = scanner.nextInt();

        if(num1 > num2 && num1 <= 21)
        {
            System.out.println("Card: " + num1);
        }
        else if (num2 > num1 && num2 <= 21)
        {
            System.out.println("Card: " + num2);
        }
        else
        {
            System.out.println("BUST. 0");
        }
    }
}
