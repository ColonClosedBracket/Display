
package ch5ex6;

import java.util.Scanner;
import java.util.Random;

public class Ch5Ex6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        final int Multi = 1, Div = 2, Sub = 3;
        int operand = rand.nextInt(4)+1;
        double num1 = rand.nextInt(10)+1, num2 = rand.nextInt(10)+1;
        double answer;
        switch (operand){
            case Multi: System.out.format("What is %1.0f * %1.0f? ",num1,num2);
            answer = num1*num2; break;
            case Div: System.out.format("What is %1.0f / %1.0f? ",num1,num2);
            answer = num1/num2; break;
            case Sub: System.out.format("What is %1.0f - %1.0f? ",num1,num2);
            answer = num1-num2; break;
            default: System.out.format("What is %1.0f + %1.0f? ",num1,num2);
            answer = num1+num2; break;}
        double response = input.nextDouble();
        if (answer >= response-0.00001 && answer <= response+0.00001){
        System.out.println("Correct!");}
        else{System.out.println("Incorrect! It was "+answer+"!");}
    }
    
}
