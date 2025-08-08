package ch8ex2;

import java.util.Scanner;
public class Ch8Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        Num number = new Num(input.nextInt());
        boolean keepRun = true;

        while(keepRun)
        {
            number.explainRules();
            String selection = input.next().toLowerCase();
            switch (selection) {
                default: keepRun = false; break;
                case "w": System.out.println("\nThe whole number is "+number.getDigit(0)); break;
                case "h": System.out.println("\nThe hundreds digit is "+number.getDigit(1)); break;
                case "t": System.out.println("\nThe tens digit is "+number.getDigit(2)); break;
                case "o": System.out.println("\nThe ones digit is "+number.getDigit(3)); break;
            }

        }
    }
    
}
