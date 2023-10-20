package com.qa;
import java.sql.SQLOutput;
import java.util.Random;
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
        System.out.println("Hello, would you like to play BlackJack?");
        String response = scanner.next();
        if (response.charAt(0) == 'Y' || response.charAt(0) == 'y')
        {
            System.out.println("Okay let's play");
        }
        else
        {
            System.out.println("bye.");
        }

        Random rand = new Random();
        boolean bust = false;
        boolean blackjack = false;
        int card1 = rand.nextInt(11);
        int card2 = rand.nextInt(11);
        System.out.println("You have " + card1 + " " + card2);
        int total = card1 + card2;
        System.out.println("Your score is " + total);
        int dcard = rand.nextInt(11);
        System.out.println("Dealer has " + dcard);
        int dtotal = dcard;
        boolean dBlackjack = false;
        boolean end = false;

        do
        {
            System.out.println("Would you like to hit or stand?");
            String hit = scanner.next();
            if(hit.charAt(0) == 'H' || hit.charAt(0) == 'h')
            {
                int card = rand.nextInt(11);
                total += card;
                System.out.println("your score is: " + total);
                if(total > 21 ||dtotal > 21)
                {
                    bust = true;
                    end = true;
                }
                else if (total == 21)
                {
                    blackjack = true;
                    end = true;
                }
                int dCard1 = rand.nextInt(11);
                dtotal += dCard1;

                System.out.println("The dealer's total is " + dtotal);
                {
                    if(dtotal + dCard1 == 21)
                    {
                        dBlackjack = true;
                        end = true;
                    }
                }

            }
            else {
                end = true;
                while (dtotal < 17) {
                    System.out.println("Dealer takes a card");
                    int finalD = rand.nextInt(11);
                    dtotal += finalD;

                    System.out.println("Dealer's score is +" + dtotal);
                }

            }
        }while(end == false);

        if(dtotal > 21)
        {
            System.out.println("DEALER IS BUST. YOU WIN");
        }
        if(dtotal > total)
        {
            System.out.println("Dealer has " + dtotal + ". You have " + total + ". You LOSE");
        }
        else if(dtotal < total)
        {
            System.out.println("Dealer has " + dtotal + ". You have " + total + ". You WIN");
        }
        else if (dtotal == total)
        {
            System.out.println("DRAW");
        }
        else if(blackjack)
        {
            System.out.println("WINNER");
        }
        else if(bust)
        {
            System.out.println("BUST");
        }
        else if(dBlackjack)
        {
            System.out.println("Dealer WINS!");
        }


    }




}
