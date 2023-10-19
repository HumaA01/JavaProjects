package com.qa;

import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.IOException;
public class App
{
    public static void main(String[] args) throws IOException {

        //assignmentStuff();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many records would you like to add?");
        int arrayLength = Integer.parseInt(reader.readLine());
        String[] recordsArray = new String[arrayLength];

        recordsArray = fillArray(recordsArray, arrayLength); //Calling fillArray Method

        System.out.println("Would you like to view the records? (Y/N)");
        String response = reader.readLine();

        if(response.equals("y") || response.equals("Y"))
        {
            System.out.println(Arrays.toString(recordsArray)+ "\n");
            System.out.println("okay bye!");

        }
        else
        {
            System.out.println("okay bye!");
        }

    }

    public static String[] fillArray(String[] recordsArray, int arrayLength) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This is a method test");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Add Record " + (i + 1) + "2:");
            System.out.println("First name?");
            String firstName = reader.readLine();
            System.out.println("What is " + firstName + "'s Last Name?");
            String lastName = reader.readLine();
            System.out.println("What is " + firstName + " " + lastName + "'s age?");
            String age = reader.readLine();
            recordsArray[i] = (firstName + " " + lastName + ": " + age);

            System.out.println("Added Record " + (i + 1)+ "\n");
        }



        return recordsArray;

    }

    public static void assignmentStuff()
    {
        long l = 123L;
        int i = 22;
        int smallBox = (int)l;
        System.out.println(smallBox);
        double d = 1.25;
        float f1 = (float)d;

        byte b = 2, b1 = 3, b2 = 0;
        b2 = (byte) (b1 + b2);

    }

}
