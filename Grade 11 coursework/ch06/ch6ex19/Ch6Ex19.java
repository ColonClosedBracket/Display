package ch6ex19;

import java.util.Scanner;

public class Ch6Ex19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence, removal;
        
        System.out.print("Enter a sentence: "); 
        sentence = input.nextLine(); //can't put spaces in, fix this next class

        System.out.print("Enter a string: ");
        removal = input.nextLine();

        sentence = sentence.replaceAll(removal, "");
        System.out.print(sentence+"\n");

    }
    
}
