package ch6ex1b;

import java.util.Scanner;

public class Ch6Ex1b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number in range: ");
        int Num1 = input.nextInt(),y = 2;
        System.out.print("Enter the second number in range: ");
        int Num2 = input.nextInt();
        boolean isPrime = true;
        
        for (int NumToCheck = Num1; NumToCheck <= Num2; NumToCheck++)
        {
            isPrime = true;
            y = 2;
            
            while (y < NumToCheck)
            {
                if (NumToCheck % y == 0)
                {
                    isPrime = false;
                    //System.out.print("\n"+NumToCheck+" is divisible by "+y);
                    //uncomment the line above to get factors of the divisible nums
                }
                
                y++;    
            }
        
            if (isPrime){System.out.print("\n"+NumToCheck+" is a prime number. ");}
        
        }

    }
    
}