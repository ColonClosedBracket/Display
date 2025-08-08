
package ch5ex2;

import java.util.Scanner;

public class Ch5Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter package weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter package length in centimeters: ");
        double length = input.nextDouble();
        System.out.print("Enter package height in centimeters: ");
        double height = input.nextDouble();
        System.out.print("Enter package depth in centimeters: ");
        double depth = input.nextDouble();
        double area = length*height*depth;
        if (weight > 27 && area > 100000){
            System.out.println("Too heavy and too large");
        } else if (weight > 27){
            System.out.print("Too heavy");
        } else if (area > 100000){
            System.out.print("Too large");
        } else {
            System.out.print ("All good!");
        }
    } 
}
