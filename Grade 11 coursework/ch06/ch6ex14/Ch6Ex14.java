package ch6ex14;

import java.util.Random;

public class Ch6Ex14 {

    public static void main(String[] args) {
        Random rand = new Random();
        int die1, die2, total;
        System.out.format("%1s %10s %10s %10s", "Dice 1","Dice 2","Total ","\n");
        for (int x = 0; x < 5; x++)
        {
            die1 = rand.nextInt(1,7);
            die2 = rand.nextInt(1,7);
            total = die1+die2;
            System.out.format("%1s %10s %10s %10s", die1,die2,total,"\n");
        }
    }
    
}
