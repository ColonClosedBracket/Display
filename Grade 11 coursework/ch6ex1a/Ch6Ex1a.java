package ch6ex1a;

import java.util.Scanner;

public class Ch6Ex1a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int Num = input.nextInt(), x = 2;
        boolean isPrime = true;
        
        while (x < Num)
        {
            if (Num % x == 0)
            {
                isPrime = false;
                System.out.print("\n"+Num+" is divisible by "+x);
            }
            x++;
        }
        if (isPrime){System.out.print("\n"+Num+" is a prime number\n");}
    }
    
}
