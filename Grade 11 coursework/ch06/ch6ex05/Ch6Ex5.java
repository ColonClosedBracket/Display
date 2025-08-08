package ch6ex5;

import java.util.Scanner;

public class Ch6Ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String Num = input.next();
        for (int x = 0; x < Num.length(); x++)
        {
            System.out.println(Num.substring(x,x+1));
        }
    }  
}
