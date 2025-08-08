package ch6ex2;

import java.util.Scanner;
        
public class Ch6Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int divisor = 2, NumToCheck = input.nextInt();
        System.out.println("The prime factors of this number are: ");
        while (divisor <= NumToCheck)
        {
            if (NumToCheck % divisor == 0)
            {
                if (divisor != NumToCheck)
                {
                    System.out.print(divisor+", ");
                }
                else
                {
                    System.out.print(divisor+". ");
                }
                NumToCheck /= divisor;
            }
            else
            {
                divisor++;
            }
        }
    }
}
