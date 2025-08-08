package chapter4;

import java.util.Scanner;

public class Ch4Ex1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //defines "input" so it works as a scanner now
        System.out.print("Enter a time less than 4.5 seconds: ");
        double time = input.nextDouble(); //gets next numerical input, error on str input
        double height = 100-(4.9*(time*time)); //calculates the height using a formula
        System.out.format("The height of the object is %.4f meters.",height); //output, rounded to 4 decimals so it's not obnoxiously long

    }
}