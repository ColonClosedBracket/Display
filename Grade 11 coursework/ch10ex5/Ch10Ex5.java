package ch10ex5;

import java.util.Scanner;
import java.util.Random;

public class Ch10Ex5 {

    public static void main(String[] args) 
    {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int pegNum, colourNum, guessNum = 0;
        boolean continueGame = true;
        
        //generating board
        System.out.print("Enter the number of pegs <1-10>: ");
        pegNum = input.nextInt();
        System.out.print("Enter the number of colours <1-9>: ");
        colourNum = input.nextInt();
        int [] secretCode = new int[pegNum];
        for (int x = 0; x < secretCode.length; x++)
        {
            secretCode[x] = rand.nextInt(0,colourNum)+1;
        }     
        
        //getting guess
        int [] guess = new int[pegNum];
        while (continueGame)
        {
            guessNum += 1;
            System.out.println("Guess #" + guessNum + ": ");
            guess = getGuess(pegNum,guessNum);
            continueGame = !checkGuess(guess, secretCode);
        }
        System.out.println("You have broken the code in "+guessNum+" guesses");
    }
    
    public static int[] getGuess(int pegNum, int guessNum)
    {
        Scanner input = new Scanner(System.in);
        int [] guess = new int[pegNum];
        for (int x = 0; x < guess.length; x++) 
        {
            System.out.println("Colour for peg #"+(x+1)+": ");
            guess[x] = input.nextInt();
        }
        return(guess);
    }
    
    public static boolean checkGuess(int[] guess, int[] secretCode)
    {
        int correctPegs = 0, correctColours = 0;
        
        //copies to a new array so I can mess with it
        int [] moddedCode = new int[secretCode.length];
        for (int x = 0; x < moddedCode.length; x++)
        {
            moddedCode[x] = secretCode[x];
        }
        
        //runthrough to get all the perfect ones
        for (int x = 0; x < guess.length; x++)
        {
            if (guess[x] == moddedCode[x])
            {
                correctPegs += 1;
                moddedCode[x] = -5;
                guess[x] = -4;
            }
        }
        
        //getting any right colour wrong spot
        for (int x = 0; x < guess.length; x++)
        {
            for (int y = 0; y < moddedCode.length; y++)
            {
                if (guess[x] == moddedCode[y])
                {
                    correctColours += 1;
                    moddedCode[y] = -5;
                    guess[x] = -4;
                }
            }
        }
        System.out.println("Pegs: "+correctPegs);
        System.out.println("Colours: "+correctColours);
        if (correctPegs == guess.length) return(true);
        else return(false);
    }
}
