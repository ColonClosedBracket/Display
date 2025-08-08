package ch10ex4;

import java.util.Scanner;
import java.util.ArrayList;
/*only using arraylist to collect the initial data (since there could be an infinite amount)
then transferring it to a normal array */

public class Ch10Ex4 {

    public static void main(String[] args) {
        int[] nums = DataCollection();
        
        //printing time :)
        System.out.print("Avg: ");
        System.out.println(arrayAverage(nums, nums.length));
        System.out.print("Max: ");
        System.out.println(arrayExtremes(nums,1));
        System.out.print("Range: ");
        System.out.println(arrayExtremes(nums,1)-arrayExtremes(nums,-1));
        System.out.print("Mode (most common numbers): ");
        System.out.println(arraySearch(arrayFrequency(nums),arrayExtremes(arrayFrequency(nums),1)));
        System.out.print("Median: ");
        System.out.println(arrayMedian(arraySort(nums)));
        System.out.print("Histogram");
        arrayToGraph(arrayFrequency(nums));
        
        
    }
    
    //gets data
    public static int[] DataCollection()
    {
        Scanner input = new Scanner(System.in);
        final int SENTINEL = 99;
        int numInput;
        
        ArrayList<Integer> number  = new ArrayList<>();
        
        System.out.print("Enter a number from 1-50 (99 to quit): ");
        numInput = input.nextInt();
        
        while (numInput != SENTINEL)
        {
            number.add(numInput);
            System.out.print("Enter a number from 1-50 (99 to quit): ");
            numInput = input.nextInt();
        }
        
        int[] numberReturn;
        numberReturn = new int[number.size()];
        
        for(int x = 0; x < number.size(); x++)
        {
            numberReturn[x] = number.get(x);
        }
        
        return(numberReturn);
    }
    
    //gets average of array
    public static double arrayAverage(int[] array, double divisor)
    {
        double counter = 0;
        for (int x = 0; x < array.length; x++){
        counter += array[x];}
        counter /= divisor;
        return(counter);
    }
    
    //gets max if modifier = 1, gets min if modifier = -1
    public static int arrayExtremes(int[] array, int modifier)
    {
        int currentMax = array[0];
        for (int x = 1; x < array.length; x++)
        {
            if (modifier*currentMax < modifier*array[x]) currentMax = array[x];
        }
        return(currentMax);
    }
    
    //makes an array with how often each value appears
    public static int[] arrayFrequency(int[] array)
    {
        int[] frequencyTally;
        frequencyTally = new int[50];
        
        for (int x = 0; x < array.length; x++)
        {
            frequencyTally[array[x]-1] += 1;
        }
        
        return(frequencyTally);
    }
    
    //gets the index of a target value
    //will pretty much only work in this scenario due to string modifications
    public static String arraySearch(int[] array, int target)
    {
        if (target == 1)return(" none.");
        String returnValue = "";
        for (int x = 0; x < array.length; x++)
        {
            if (array[x] == target)returnValue = returnValue+" "+(x+1);
        }
        
        return(returnValue);
    }
    
    //makes a graph in 5 unit wide increments
    public static void arrayToGraph(int[] array)
    {
        int[] groupFrequency;
        groupFrequency = new int[10];
        int z;
        for (int x = 0; x < 10; x++)
        {
            z = 0;
            for (int y = x*5; y <= (x*5)+4; y++)
            {
                z += array[y];
            }
            groupFrequency[x] += z;
        }
        
        for (int x = 0; x < 10; x++)
        {
            System.out.format("%-10s","\n"+(1+(x*5))+" - "+(5+(x*5))+": ");
            for (int y = groupFrequency[x]; y > 0; y--)
            {
                System.out.print("*");
            }
        }
    }
    
    //sorts ascending order
    public static int[] arraySort(int[] array)
    {
        int transfer = 0;
        int[] sortedArray;
        sortedArray = new int[array.length];
        
        for (int x = 0; x < array.length; x++)
        {sortedArray[x] = array[x];}
        
        for (int y = 0; y < array.length; y++)
        {
            for (int x = 1; x < array.length; x++) 
            {
                if (sortedArray[x - 1] > sortedArray[x]) 
                {
                    transfer = sortedArray[x - 1];
                    sortedArray[x - 1] = sortedArray[x];
                    sortedArray[x] = transfer;
                }
            }
        }
        return(sortedArray);
    }
    
    //gets median of a sorted array
    public static double arrayMedian(int[] array)
    {
        if (array.length % 2 == 1)
        {
            return(array[array.length/2]);
        }
        else
        {
            double x = (array[array.length/2]+array[(array.length/2)-1]);
            return(x/2.0);
        }
    }
}
