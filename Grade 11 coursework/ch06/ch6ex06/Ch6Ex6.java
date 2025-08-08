package ch6ex6;

import java.util.Scanner;

public class Ch6Ex6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String Num = input.next(), middleman;
        int sum = 0;
        for (int x = 0; x < Num.length(); x++)
        {
            middleman = (Num.substring(x,x+1));
            sum += middleman.compareTo("0");
        }
        System.out.println("The sum of the digits is: "+sum);
    }  
}
