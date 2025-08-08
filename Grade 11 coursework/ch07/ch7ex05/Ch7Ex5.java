package ch7ex5;

import java.util.Scanner;

public class Ch7Ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,n,d,q;
        System.out.print("Enter your total coins:\nPennies: ");
        p = input.nextInt();
        System.out.print("Nickels: ");
        n = input.nextInt();
        System.out.print("Dimes: ");
        d = input.nextInt();
        System.out.print("Quarters: ");
        q = input.nextInt();
        
        System.out.print("Total: "+addCoins(p,n,d,q));
    }
    public static String addCoins(int Pennies, int Nickels, int Dimes, int Quarters){
        double money = (int)(100*(Pennies*0.01+Nickels*0.05+Dimes*0.1+Quarters*0.25+0.000001));
        return("$"+(money/100));
    }
    
}
