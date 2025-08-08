package ch4ex11a;

import java.util.Scanner;

public class Ch4Ex11a {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Burgers;
        int Fries;
        int Sodas;
        double subTotal;
        double Total;
        double tax;
        System.out.print("Enter the number of burgers: ");
        Burgers = input.nextInt();
        System.out.print("Enter the number of fries: ");
        Fries = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        Sodas = input.nextInt();
        subTotal = ((Burgers*1.69)+(Fries*1.09)+(Sodas*0.99));
        Total = (subTotal*1.065);
        tax = (subTotal*0.065);
        System.out.format("\nTotal before tax: $%.2f",subTotal);
        System.out.format("\nTax: $%.2f",tax);
        System.out.format("\nTotal after tax: $%.2f\n",Total);
        
        
    }
    
}
