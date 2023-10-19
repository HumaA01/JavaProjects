package com.qa;

import java.util.Random;

public class Car
{
    public String carColour()
    {
        Random rand = new Random();
        int num = rand.nextInt(4);

        switch(num)
        {
            case 1:
                return "Yellow";

            case 2:
                return "Red";

            case 3:
                return "purple";

            default: return "White";
        }


    }
}
