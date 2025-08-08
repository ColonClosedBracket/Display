package ch34quiz;

import java.util.Scanner;

public class CH34quiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();
        double time = ((amount/principal)-1)/rate;
        System.out.format("The time period is %1.1f",time);
    }
    
}
