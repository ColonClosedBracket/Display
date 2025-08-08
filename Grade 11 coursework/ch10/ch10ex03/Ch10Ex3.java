package ch10ex3;

import java.util.Random;

public class Ch10Ex3 {

    public static void main(String[] args) {
        int[] RandomStats;
        RandomStats = new int[10];
        Random rand = new Random();
        
        for (int x = 0; x < 500; x++)
        {
            RandomStats[rand.nextInt(0,10)] += 1;
        }
        
        System.out.format("%-10s %1s","Number","Occurences");
        for (int x = 0; x < 10; x++)
        {
            System.out.format("%-12s%-2s","\n"+x,RandomStats[x]);
        }
        
    }
    
}
