package ch4ex6;

import java.util.Scanner;

public class Ch4Ex6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ChangeInCents;
        int Quarters;
        int Dimes;
        int Nickels;
        int Pennies;
        System.out.format("%-20s %-5s","","Enter the change in cents: "); //ask
        ChangeInCents = input.nextInt(); //get input
        Quarters = ChangeInCents/25; //find how many there are
        ChangeInCents -= Quarters*25; //remove them
        Dimes = ChangeInCents/10; //same thing but with dimes
        ChangeInCents -= Dimes*10;
        Nickels = ChangeInCents/5; //same thing but with nickels
        ChangeInCents -= Nickels*5;
        Pennies = ChangeInCents; //no need for math since all that's left is pennies
        System.out.format("%-21s %-5s %-5s %-21s %-10s %-5s %-21s %-10s %-5s %-21s %-10s %-5s","\n","Quarters: ",Quarters,"\n","Dimes: ",Dimes,"\n","Nickels: ",Nickels,"\n","Pennies: ",Pennies);  //monstrosity of an output line
        
    }
    
}