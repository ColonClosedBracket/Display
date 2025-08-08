package ch78test;

import java.util.Scanner;

public class Ch78Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the order amount: ");
        
        calcTax tax = new calcTax(input.nextDouble());
        
        Delivery(tax.Taxrate());
    }
    
    public static void Delivery(double amount)
    {
        if (amount < 1000)
        {
            System.out.format("It will cost %1.2f$.",(amount+25));
        }
        else if (amount < 5000)
        {
            System.out.format("It will cost %1.2f$.",(amount+65));
        }
        else
        {
            System.out.format("It will cost %1.2f$.",(amount+85));
        }
    }
    
}
