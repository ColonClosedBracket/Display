package ch5ex3;

import java.util.Scanner;

public class Ch5Ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of eggs purchased: ");
        int EggNum = input.nextInt();
        double cost;
        if ((EggNum/12) < 4){
            cost = (0.5/12)*EggNum;
        }
        else if ((EggNum/12) >= 4 && (EggNum/12) < 6){ //eggnum is divided since it's per dozen
            cost = (0.45/12)*EggNum;}//cost is divided since it's per dozen
        else if ((EggNum/12) >= 6 && (EggNum/12) < 11){
            cost = (0.4/12)*EggNum;}
        else{cost = (0.35/12)*EggNum;}
        System.out.format("The cost of %s eggs is %1.2f$",EggNum,cost);
    }
    
}
