package ch6extra2;

import java.util.Scanner;

public class Ch6Extra2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        final String name = input.nextLine().toUpperCase();
        
        System.out.println(name);
        for (int x = 1; x < name.length()-1; x++)
        {
            System.out.print(name.substring(x,x+1));
            for (int y = 1; y < name.length()-1; y++)
            {
                System.out.print("*");
            }
            System.out.println(name.substring(name.length()-x-1,name.length()-x));
        }
        for (int z = name.length(); z > 0; z--)
        {
            System.out.print(name.substring(z-1,z));
        }
    }
    
}
