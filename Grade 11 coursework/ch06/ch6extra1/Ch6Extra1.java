package ch6extra1;

import java.util.Scanner;

public class Ch6Extra1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        final String sentence = input.nextLine();
        String MoldSentence = sentence;
        boolean ContVowel = true;
        char letter = 0;
        
        //part A
        System.out.println("a) "+sentence.length());
        
        //part B
        int z = 1;
        for (int x = 0; x < sentence.length(); x++)
        {
        if (" ".equals(sentence.substring(x, x+1)) && !" ".equals(sentence.substring(x+1, x+2)))
        {z++;}
        }
        System.out.println("b) "+z);
        
        //part C
        System.out.print("c) ");
        for (int x = sentence.length(); x > 0; x--)
        {System.out.print(sentence.substring(x-1, x));}
        
        //part D
        System.out.println("\nd) "+sentence.toUpperCase());
        
        //part E
        System.out.println("e) "+sentence.toLowerCase());
        
        //part F
        z = 0;
        while(ContVowel)
        {
            if (MoldSentence.indexOf("a") != -1)
                {MoldSentence = MoldSentence.replaceFirst("a", "");
                z++;}
            else if (MoldSentence.indexOf("e") != -1)
                {MoldSentence = MoldSentence.replaceFirst("e", "");
                z++;}
            else if (MoldSentence.indexOf("i") != -1)
                {MoldSentence = MoldSentence.replaceFirst("i", "");
                z++;}
            else if (MoldSentence.indexOf("o") != -1)
                {MoldSentence = MoldSentence.replaceFirst("o", "");
                z++;}
            else if (MoldSentence.indexOf("u") != -1)
                {MoldSentence = MoldSentence.replaceFirst("u", "");
                z++;}
            else{ContVowel = false;
            System.out.println("f) "+z);}
        }
        
        //part G
        z = (sentence.replaceAll(" ","").length()) - z;
        System.out.println("g) "+z);
        
        //part H
        System.out.print("h) ");
        MoldSentence = sentence;
        for (int x = 0; x < sentence.length(); x++)
        {
            if (" ".equals(sentence.substring(x,x+1)))
            {
                MoldSentence = sentence.substring(0,x);
                x = sentence.length();
            }
        }
        for (int x = 0; x < MoldSentence.length(); x++)
        {
            letter = MoldSentence.charAt(x);
            System.out.print((int)letter+" ");
        }
        
        //part I
        if (sentence.indexOf(" and ")!=-1){
            System.out.println("\ni) Yes");
        }
        else{System.out.println("\ni) No");}
        
        //part J
        System.out.print("j) ");
        for (int x = 0; x < sentence.length(); x++)
        {
            if (sentence.substring(x,sentence.length()).startsWith("aa"))
            {
                System.out.print("AA ");
            }
            if (sentence.substring(x,sentence.length()).startsWith("ee"))
            {
                System.out.print("EE ");
            }
            if (sentence.substring(x,sentence.length()).startsWith("ii"))
            {
                System.out.print("II ");
            }   
            if (sentence.substring(x,sentence.length()).startsWith("oo"))
            {
                System.out.print("OO ");
            }   
            if (sentence.substring(x,sentence.length()).startsWith("uu"))
            {
                System.out.print("UU ");
            }   
        }
        
        //part K
        z = 0;
        for (int x = 0; x < sentence.length(); x++)
        {
            if(sentence.substring(x,x+1).compareTo("a") < -6 && sentence.substring(x,x+1).compareTo("a") >= -32)
            {
                z++;
            }
        }
        System.out.println("\nk) "+z);
        
        //part L
        z = 0;
        for (int x = 0; x < sentence.length(); x++)
        {
            if(sentence.substring(x,x+1).compareTo("a") >= 0)
            {
                z++;
            }
        }
        System.out.println("l) "+z);
        
        //part M
        z = 0;
        MoldSentence = sentence.replaceAll(" ","");
        for (int x = 0; x < MoldSentence.length(); x++)
        {
            if(MoldSentence.substring(x,x+1).compareTo("a") < 0 && MoldSentence.substring(x,x+1).compareTo("a") >= -6)
            {
                z++;
            }
            else if(MoldSentence.substring(x,x+1).compareTo("a") < -32)
            {
                z++;
            }
        }
        System.out.println("m) "+z);
    }
    
}
