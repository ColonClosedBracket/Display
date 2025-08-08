package ch5ex5;

import java.util.Scanner;

public class Ch5Ex5 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade %: ");
        double grade = input.nextDouble();
        if (grade <= 100 && grade >= 90){
        System.out.print("The corresponding letter grade is: A\n");}
        else if (grade < 90 && grade >= 80){
        System.out.print("The corresponding letter grade is: B\n");}
        else if (grade < 80 && grade >= 70){
        System.out.print("The corresponding letter grade is: C\n");}
        else if (grade < 70 && grade >= 60){
        System.out.print("The corresponding letter grade is: D\n");}
        else{System.out.print("The corresponding letter grade is: F\n");}
    }
    
}
