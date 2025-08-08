package ch8ex8;

import java.util.Scanner;
import java.util.Random;

public class Adder {
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    private int num1, num2;
    
    //constructor
    public Adder(){}
    
    //generates two random numbers and outputs then in question format
    public void makeQuestion()
    {
        num1 = random.nextInt(1, 21);
        num2 = random.nextInt(1, 21);
        System.out.print(num1+" + "+num2+" = ");
    }
    
    //gets input and checks if it's right
    public int getAnswer()
    {
        int answer = input.nextInt();
        for (int x = 5; x > 0; x -= 2){
            if (answer == num1 + num2)
            {
                return(x);
            }
            else if (answer == 999)
            {
                return(999);
            }
            else
            {
                System.out.print("Wrong answer. Try again. ");
                answer = input.nextInt();
            }
        }
        return(0);
    }
    
}
