package ch10ex1;

import java.util.Random;

public class Ch10Ex1 {

    public static void main(String[] args) {
        Random rand = new Random();
        int y = 0, z = 0;
        
        int[] unfilteredNums;
        unfilteredNums = new int[25];
        
        int[] evenNums;
        evenNums = new int[25];
        
        int[] oddNums;
        oddNums = new int[25];
         
        for (int x = 0; x < unfilteredNums.length; x++)
        {
            unfilteredNums[x] = rand.nextInt(0,100);
        }
        
        for (int x = 0; x < unfilteredNums.length; x++)
        {
            if(unfilteredNums[x] % 2 == 1)
            {
                oddNums[y] = unfilteredNums[x];
                y += 1;
            }
            else
            {
                evenNums[z] = unfilteredNums[x];
                z += 1;
            }
        }
        
        //print
        System.out.print("ODD: ");
        for (int x = 0; x < y-1; x++)
        {
            System.out.print(oddNums[x]+", ");
        }
        System.out.print(oddNums[y-1]+".");
        
        System.out.print("\nEVEN: ");
        for (int x = 0; x < z-1; x++)
        {
            System.out.print(evenNums[x]+", ");
        }
        System.out.print(evenNums[z-1]+".");
        
    }
}
