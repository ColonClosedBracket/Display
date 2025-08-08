package ch4ex7;

import java.util.Scanner;

public class Ch4Ex7 {

    public static void main(String[] args) {
        int num; //full inputted number
        int dig1; //first digit (ones)
        int dig2; //second digit (tens)
        int dig3; // third digit (hundred)
        System.out.println("Enter a three digit number: ");
        Scanner input = new Scanner(System.in); //sets up input
        num = input.nextInt(); //gets next numerical input
        dig1 = num % 10; //gets remainder, which is the ones digit
        num -= dig1; //subtracts the ones digit for clean division
        num /= 10; //divides by ten to get rid of the zero
        dig2 = num % 10; //does the same thing again
        num -= dig2;
        num /= 10;
        dig3 = num; //the leftover number is the hundreds digit
        System.out.println("The hundreds-place digit is "+dig3); //print it
        System.out.println("The tens-place digit is "+dig2);
        System.out.println("The ones-place digit is "+dig1);
    }
    
}
