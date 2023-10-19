package com.qa;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        //ifPractice();
//        speed();
        //ternaryPractice();

//        System.out.println( "Hello World!" );

        switchPractice();
    }


    public static void ifPractice()
    {
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        int luckyNumber = randNum;
        System.out.println("Your lucky number today is: " + randNum);

        if(luckyNumber%2 == 0)
        {
            System.out.println("lucky number is EVEN");
        }
        else
        {
            System.out.println("lucky number is ODD");
        }
    }

    public static void speed()
    {
        Random randomInt = new Random();
        int randNum = randomInt.nextInt(100);

        int speed = randNum;

        System.out.println("Your speed is " + speed +"mph. The limit is 50mph");
        if(speed == 50)
        {
            System.out.println("You driving at the right speed!");
        }
        else if(speed > 50)
        {
            System.out.println("SLOW DOWN! You're driving too fast.");
        }
        else {
            System.out.println("Drive faster, you're too SLOW!");
        }
    }

    public static void ternaryPractice()
    {
        int value1 = 120, value2 = 105, maxValue = 0;
        maxValue = (value1 > value2) ? value1 : value2;
        System.out.println("Max value is " + maxValue);
    }
    public static void switchPractice()
    {
        Random randomInt = new Random();
        int randNum = randomInt.nextInt(6);
        int choice = randNum;

        System.out.println("You have selected option: " + choice);
        switch(choice)
        {
            case 1:
                System.out.println("Mocha Selected");
                break;
            case 2:
                System.out.println("Latte Selected");
                break;
            case 3:
                System.out.println("Hot Chocolate Selected");
                break;
            case 4:
                System.out.println("Tea Selected");
                break;
            case 5:
                System.out.println("Hot Water Selected");
            default:
                System.out.println("Black Coffee Selected");

        }

    }

    public static void E1()
    {

    }



}
