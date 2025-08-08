package ch7ex8;

import java.util.Scanner;
import java.util.Random;

public class Ch7Ex8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int points = 1000, wager;
        wager = 1001;
        boolean gameNotEnd = true;
        explainRules();
        while (points > 0 && gameNotEnd)
        {
            
            while (wager > points)
            {
                System.out.println("\nYou have "+points+" points left. ");
                System.out.print("Enter how many points to risk (has to be less than overall points): ");
                wager = input.nextInt();
            }
            points -= wager;
            
            if (predictNum())
            {
                wager*=2;
                points += wager;
            }
            wager = points + 1;
            
            if (points != 0)
            {
                System.out.println("\nYou have "+points+" points. ");
                System.out.print("Type Q to quit, or type C to continue ");
                String quit = input.next();
                if ("q".equals(quit.toLowerCase())){gameNotEnd = false;}
            }
            
        }
    }
    

    public static boolean predictNum()
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); //make it make a random number, check aginst guess, then print the random one and say if the player got it right
        int secretNum = rand.nextInt(1,14);
        System.out.print("Predict: <1=HIGH, 0=LOW> ");
        int prediction = input.nextInt();
        if (secretNum <= 6 && prediction == 0)
        {
            System.out.println("Number is "+secretNum+"\nYou win.");
            return(true);
        }
        
        else if (secretNum >= 8 && prediction == 1)
        {
            System.out.println("Number is "+secretNum+"\nYou win.");
            return(true);
        }
        
        else{
            System.out.println("Number is "+secretNum+"\nYou lose.");
            return(false);
        }
    }
    public static void explainRules()
    {
        System.out.println("High Low Game");
        System.out.println("\nRULES");
        System.out.println("Numbers 1-6 are low");
        System.out.println("Numbers 8-13 are high");
        System.out.println("7 is neither high nor low");
        System.out.println("On your turn, you choose how many points to wager, and guess high or low.");
        System.out.println("If you're correct in your guess, the points you wagered are doubled.");
        System.out.println("If you're wrong, you get none of them.");
    }
    
}
