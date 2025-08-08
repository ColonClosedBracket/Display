package ch10ex8;

import java.util.Scanner;

public class Ch10Ex8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence to check: ");
        String palindrome = input.nextLine();
        String formatWord = palindrome.toLowerCase().replaceAll(" ", "");
        
        for (int x = 1; x < formatWord.length(); x++)
        {
            int length = formatWord.length();
            if (!(formatWord.substring(x-1, x).equals(formatWord.substring(length-x, length-x+1))))
            {
                System.out.print(palindrome+" is not a palindrome :( ");
                break;
            }
            else
            {
                System.out.print(palindrome+" is a palindrome! ");
                break;
            }
        } 
    }
}
