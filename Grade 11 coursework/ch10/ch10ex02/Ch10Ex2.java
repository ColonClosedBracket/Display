package ch10ex2;

public class Ch10Ex2 {

    public static void main(String[] args) {
        int[] array;
        array = new int[101];
        
        for (int x = 0; x < array.length; x++)
        {
            array[x] = (x+(x%10)+((x/10)%10)+(x/100));
        }
        
        System.out.format("%-15s %-2s", "Index", "Generated Number\n");
        for (int x = 0; x < array.length; x++)
        {
            System.out.format("%-15s %-2s", x, array[x]);
            System.out.println();
        }
    }
    
}
