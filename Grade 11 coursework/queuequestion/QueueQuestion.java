package queuequestion;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class QueueQuestion {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the maximum weight: ");
        int max = input.nextInt();
        System.out.print("Enter the number of railway cars: ");
        int carNums = input.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int x = 0; x < carNums; x++)
        {
            System.out.print("Enter the weight of railway car #"+(x+1)+": ");
            q.add(input.nextInt()); //Adding them in  backwards order, need to fix
        }
        // ^ Collecting inputs
        
        System.out.println("The bridge can hold "+bridgeTolerance(q,max,carNums)+" railway cars. ");
    }
    public static int bridgeTolerance(Queue q, int max, int carNums) //works not at all
    {
        
        int sum = 0;
        if (carNums <= 4)
        {
            for (int x = 0; x < carNums; x++)
            {
                sum += (int) q.poll();
                if (sum > max)return(x);
            }
            return(carNums);
        }
        else
        {
            Queue<Integer> sumQueue = new LinkedList<>();
            for (int x = 1; x <= carNums; x++)
            {
                sumQueue.add((int) q.poll());
                if (sumQueue.size() > 4)
                {
                    sumQueue.poll(); //gets rid of overflow
                }
                
                Queue<Integer> tempQueue = new LinkedList<>(sumQueue); //set it equal to the other

                sum = 0;
                int z = tempQueue.size(); //use a var so the for loop doesn't change
                for (int y = 0; y < z; y++)
                {
                    sum += tempQueue.poll();
                }
                
                if (sum > max)return(x-1);
            }
            return(carNums); //assuming all get through
        }
    }
}

