package ch4ex12;

import java.util.Scanner;

public class Ch4Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes spent on each task: ");
        System.out.print("Designing: ");
        int DesignMins = input.nextInt();
        System.out.print("Coding: ");
        int CodingMins = input.nextInt();
        System.out.print("Debugging: ");
        int DebugMins = input.nextInt();
        System.out.print("Testing: ");
        int TestMins = input.nextInt();
        
        double SumMins = DesignMins+CodingMins+DebugMins+TestMins;
        
        System.out.format("%-12s %-5s","\nTask","% of Time");
        System.out.format("\nDesigning: %.2f%s",((DesignMins/SumMins)*100),"%");
        System.out.format("\nCoding: %-3s%.2f%s","",((CodingMins/SumMins)*100),"%");
        System.out.format("\nDebugging: %.2f%s",((DebugMins/SumMins)*100),"%");
        System.out.format("\nTesting: %-2s%.2f%s","",((TestMins/SumMins)*100),"%\n");
    }
    
}
