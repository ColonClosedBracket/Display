package recursivequestion;

import java.util.Scanner;

public class RecursiveQuestion {
    
    private static int x = 0;
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        try{System.out.print("Enter a number to check: ");
        System.out.println("It contains "+numDigits(input.nextInt())+" digits. ");}
        catch(java.util.InputMismatchException r){System.err.println("Invalid input (too large or not an integer) "+r);}
    }
    public static int numDigits(int num) 
    {
        if (num / 10 == 0) 
        {
            return (1);//just to cancel the loop
        }
        numDigits(1, num);
        return (x);//final return
    }
    public static int numDigits(int digits, int num) 
    {
        if (num / 10 == 0) 
        {
            x = digits;
            return (0);//just to cancel the loop
        }
        num /= 10;
        numDigits(digits + 1, num);
        return (x);//final return
    }
}