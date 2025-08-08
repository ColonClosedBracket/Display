package ch7ex10;

import java.util.Scanner;
import java.util.Random;

public class Ch7Ex10 {

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
                giveHint(PlayerNum,SecretNum);
            }
        }

        System.out.println("You Won!");
        
    }
    
    public static void giveHint(int player,int secret)
    {
        if (player > secret){
        System.out.println("Hint: try a lower number. ");
        }
        else {
        System.out.println("Hint: try a higher number. ");
        }
    }
}