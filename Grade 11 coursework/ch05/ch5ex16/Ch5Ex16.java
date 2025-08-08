package ch5ex16;

import java.util.Scanner;

public class Ch5Ex16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = Math.toRadians(input.nextDouble());
        System.out.format("\nSine: %1.2f",Math.sin(angle));
        System.out.format("\nCosine: %1.2f",Math.cos(angle));
        System.out.format("\nTangent: %1.2f",Math.tan(angle));
        
    }
    
}
