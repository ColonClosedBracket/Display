package ch4ex2;

import java.util.Scanner;

public class Ch4Ex2 {

    public static void main(String[] args) {
        double diameter; //of the pizza
        double cost; //of the pizza
        Scanner input = new Scanner(System.in); //defines "input" so it works as a scanner now
        System.out.print("Enter the diameter of the pizza in inches: ");
        diameter = input.nextDouble(); //gets next input throws error on str
        cost = 1.75+(0.05*diameter*diameter); //calc for the cost
        System.out.format("The cost of making the pizza is $%-2.2f\n",cost); //result rounded to a possible price
    }
    
}