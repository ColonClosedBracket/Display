package ch6ex8a;

import java.util.Scanner;
import java.util.Random;

public class Ch6Ex8a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int SecretNum = rand.nextInt(20)+1;
        int PlayerNum = 0;
        while (PlayerNum != SecretNum)
        {
            
            System.out.print("Enter a number between 1-20: ");
            PlayerNum = input.nextInt();
            
            if (SecretNum != PlayerNum)
            {
                System.out.print("Try again. ");
            }
        }

        System.out.println("You Won!");
        
    }
}