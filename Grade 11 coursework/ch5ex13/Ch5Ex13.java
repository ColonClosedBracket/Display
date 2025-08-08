package ch5ex13;

import java.util.Scanner;

public class Ch5Ex13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        double P = input.nextDouble();
        System.out.print("Interest Rate: ");
        double R = input.nextDouble();
        System.out.print("Number of monthly payments: ");
        double M = input.nextDouble();
        double payment = P*(R/12)/(1-Math.pow((1+R/12),(-1*M)));
        System.out.format("The monthly payment is %1.2f ",payment);
    }
    
}
