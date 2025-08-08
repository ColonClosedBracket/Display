package ch5ex9b;

import java.util.Scanner;
import java.util.Random;

public class Ch5Ex9b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int SecretNum = rand.nextInt(20)+1;
        System.out.print("Enter a number between 1-20: ");
        int PlayerNum = input.nextInt();
        if (SecretNum == PlayerNum){
        System.out.println("Computer's number: "+SecretNum);
        System.out.println("Player's number: "+PlayerNum);
        System.out.println("You Won!");}
        else{System.out.println("Computer's number: "+SecretNum);
        System.out.println("Player's number: "+PlayerNum);
        System.out.println("Better luck next time. ");}
    }
    
}
