package ch12ex1;

import java.io.*;

public class Ch12Ex1 {

    public static void main(String[] args) {
        final String reallyLongPath = "c:\\Users\\tlott4496\\OneDrive - Hamilton Wentworth District School Board\\2024\\Comp Sci\\Projects\\Ch12Ex1\\src\\ch12ex1\\source.txt";
        try {
            File textFile = new File(reallyLongPath);
            textFile.createNewFile();
        } catch (IOException r) {
            System.out.println("Could not create file with that name.");
            System.err.println(r.getMessage());
        }
        
        double wordNum = 1, wordLength = 0;
        boolean notALetter = false;
        FileReader in;
        BufferedReader readStream;
        try {
            in = new FileReader(reallyLongPath);
            readStream = new BufferedReader(in);
            int x = readStream.read();
            while (x != -1)
            {
                System.out.print((char)x);
                if ((x >= 65 && x <= 90)||(x >= 97 && x <= 122))
                {
                    wordLength += 1;
                    if(notALetter)
                    {
                        wordNum += 1;
                        notALetter = false;
                    }
                }
                else
                {
                    notALetter = true;
                }
                x = readStream.read();
            }
        } catch (FileNotFoundException r) {
            System.out.println("Could not find file with that name.");
            System.err.println(r.getMessage());
        }
        catch (IOException r) {
            System.out.println("Could not read file.");
            System.err.println(r.getMessage());
        }
        System.out.println("\nThere are "+(int)wordNum+" words in the file. ");
        System.out.format("The average length of the words is %.2f (rounded to 2 decimals).",(wordLength/wordNum));
    }

}
