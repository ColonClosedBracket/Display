package ch4ex8;

import java.util.Scanner;

public class Ch4Ex8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Num1;
        int Num2;
        System.out.print("Enter an integer: ");
        Num1 = input.nextInt(); //save the number in a var
        System.out.print("\nEnter a second integer: ");
        Num2 = input.nextInt(); //save the number in a var
        System.out.println("\n"+Num1+" / "+Num2+" = "+Num1/Num2); //does the math in the print statement since it's simple enough
        System.out.println(Num1+" % "+Num2+" = "+Num1%Num2);
        System.out.println("\n"+Num2+" / "+Num1+" = "+Num2/Num1);
        System.out.println(Num2+" % "+Num1+" = "+Num2%Num1);
    }
    
}