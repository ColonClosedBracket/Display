package ch12ex2b;

import java.io.*;
import java.util.ArrayList;

public class Ch12Ex2b {

   
    public static void main(String[] args) {
//Right now a chapter from 20000 leagues under the sea in french is copied into the source file, change if you want
        final String reallyLongPath = "c:\\Users\\tlott4496\\OneDrive - Hamilton Wentworth District School Board\\2024\\Comp Sci\\Projects\\Ch12Ex2b\\src\\ch12ex2b\\source.txt";
// ^ this path leads to my project folder for this file. i don't think you'll be able to change what's in the source file without changing the path.
        try {
            File textFile = new File(reallyLongPath);
            textFile.createNewFile();
        }
        catch(IOException r)
        {
            System.out.println("Could not create file with that name.");
            System.err.println(r.getMessage());
        }
        //^ Creates the file if it doesn't exist yet
        
        FileReader in;
        BufferedReader readStream;
        String word = "";
        String wordTransfer;
        int numTransfer;
        ArrayList <String>wordList;
        wordList = new ArrayList<>();
        ArrayList <Integer>numList;
        numList = new ArrayList<>();
       
        try{
            in = new FileReader(reallyLongPath);
            readStream = new BufferedReader(in);
            int x = 1;
            while (x != -1) //loops until the end of the file
            {
                x = readStream.read();
                if (x >= 97 && x <= 122) //Checks if it's between a-z
                {
                    word += (char)x;
                }
                else if (x >= 65 && x <= 90) //Checks if it's between A-Z
                {
                    x += 32; //converts to lowercase
                    word += (char)x;
                }
                else if (x == 231 || x == 232 || x == 233 || x == 244 || x == 224 ) //Checks if it's an accented letter
                {
                    word += (char)x;
                }
                else //Since it's not a letter, the word is complete
                {
                    if (word.equals("")) //Makes sure no blanks are being added
                    {
                    
                    }
                    else if (wordList.indexOf(word) != -1) //Increases if there's already the word
                    {
                        numList.set(wordList.indexOf(word), 1+numList.get(wordList.indexOf(word)));
                    }
                    else //Appends it if it's a new word
                    {
                        wordList.add(word);
                        numList.add(0);
                    }
                    word = "";
                }
            }
        }
        catch (FileNotFoundException r) {
            System.out.println("Could not find file with that name.");
            System.err.println(r.getMessage());
        }
        catch (IOException r) {
            System.out.println("Could not read file.");
            System.err.println(r.getMessage());
        }
        //Unsorted lists are complete here
        
        for (int y = 1; y < wordList.size(); y++) 
        {
            for (int x = 1; x < wordList.size(); x++) 
            {
                if (wordList.get(x).compareTo(wordList.get(x - 1)) < 0) 
                {
                    wordTransfer = wordList.get(x);
                    wordList.set(x, wordList.get(x - 1));
                    wordList.set(x - 1, wordTransfer);
                    numTransfer = numList.get(x);
                    numList.set(x, numList.get(x - 1));
                    numList.set(x - 1, numTransfer);
                }
            }
        }
        //Sorted lists
        //fancy format
        System.out.format("%1s %-15s %-3s", "\n", "WORD", "OCCURENCES");
        for (int x = 0; x < wordList.size(); x++)
        {
            System.out.format("%1s %-15s %-3s", "\n", wordList.get(x), numList.get(x));
        }
    }
}