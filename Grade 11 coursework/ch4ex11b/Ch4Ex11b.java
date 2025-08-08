package ch4ex11a;

import java.util.Scanner;

public class Ch4Ex11b {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Burgers;
        int Fries;
        int Sodas;
        double Money;
        double subTotal;
        double Total;
        double tax;
        System.out.print("Enter the number of burgers: "); //get input
        Burgers = input.nextInt();
        System.out.print("Enter the number of fries: ");
        Fries = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        Sodas = input.nextInt();
        subTotal = ((Burgers*1.69)+(Fries*1.09)+(Sodas*0.99)); //add inputs up with appropriate cost
        Total = (subTotal*1.065);
        tax = (subTotal*0.065); //technically don't need another variable for tax, but it looks cleaner
        System.out.format("\nTotal before tax: $%.2f",subTotal); //using the %.2f to round to an actually possible price
        System.out.format("\nTax: $%.2f",tax);
        System.out.format("\nTotal after tax: $%.2f",Total);
        System.out.print("\nEnter the amount tendered: ");
        Money = input.nextDouble();
        System.out.format("Change due: $%.2f\n",(Money-Total));
        
        
    }
    
}
