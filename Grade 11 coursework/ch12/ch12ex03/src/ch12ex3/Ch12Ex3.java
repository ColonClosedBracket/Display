package ch12ex3;

import java.io.*;
import java.util.ArrayList;

public class Ch12Ex3 {

    public static void main(String[] args) {
        final String reallyLongPath = "c:\\Users\\tlott4496\\OneDrive - Hamilton Wentworth District School Board\\2024\\Comp Sci\\Projects\\Ch12Ex3\\src\\ch12ex3\\testResults.txt";
// ^ this path leads to my project folder for this file
        try
        {
            File textFile = new File(reallyLongPath);
            textFile.createNewFile();
        }
        catch(IOException r)
        {
            System.out.println("Could not create file with that name.");
            System.err.println(r.getMessage());
        }
        
        FileReader input;
        BufferedReader readStream;
        String line;
        int lineNum = 0;
        String answers = "";
        ArrayList <String>nameList;
        nameList = new ArrayList<>();
        ArrayList <Double>scoreList;
        scoreList = new ArrayList<>();
        try 
        {
            input = new FileReader(reallyLongPath);
            readStream = new BufferedReader(input);
            line = readStream.readLine();
            while (!line.isBlank() || true)
            {
                lineNum++;
                if (lineNum == 1)
                {
                    answers = line;
                }
                else if (lineNum % 2 == 0)
                {
                    nameList.add(line);
                }
                else
                {
                    double y = 0;
                    for (int x = 1; x <= answers.length(); x++)
                    {
                        if (answers.substring(x-1,x).equals(line.substring(x-1,x)))
                        {
                            y++;
                        }
                    }
                    scoreList.add(y/answers.length());
                }
                
                line = readStream.readLine();
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
        catch (NullPointerException r) {
            //Ends the loop without error message
        }
        
        //Fancy format
        for (int x = 0; x < nameList.size(); x++)
        {
            System.out.format("%-15s %-2.0f",nameList.get(x), scoreList.get(x)*100);
            System.out.println("%");
        }
    }
}
