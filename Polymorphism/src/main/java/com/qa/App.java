package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //object instantiation

        Car lisaCar = new Car();
        System.out.println("Lisa's car is " + lisaCar.carColour());
        Car bartCar = new Car();
        System.out.println("Bart's car is " + bartCar.carColour());
    }
}
