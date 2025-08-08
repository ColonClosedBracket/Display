package stackquestion;

import java.util.Scanner;
import java.util.Stack;

public class StackQuestion {

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of tests: ");
        String[] tests = new String[input.nextInt()];
        for (int x = 0; x < tests.length; x++)
        {
            tests[x] = "";
            System.out.print("Enter the number of items in test #"+(x+1)+": ");
            int z = input.nextInt();
            for (int y = 0; y < z; y++)
            {
                System.out.print("Enter the car number: ");
                tests[x] += input.nextInt();
            }
        }
        Stack Mountain = new Stack();
        Stack Branch = new Stack();
        for (int xyz = 0; xyz < tests.length; xyz++) //Running each test
        {
            //Setting up
            for (int x = tests[xyz].length(); x > 0; x--) //future: fix double digit numbers
            {
                Mountain.push(tests[xyz].substring(x-1,x));
            }
            //add to stack
            
            /* uncomment these to see the arrays at the start of the program
            System.out.println(Arrays.toString(tests));
            System.out.println(Mountain);*/
            
            //Solving
            int currentSearch = 1;
            int size = Mountain.size();
            String tempStore;
            for (int x = 0; x < size*2; x++)
            {
                int checkElse = 2;
                if (!Mountain.isEmpty())
                {
                    tempStore = (String) Mountain.pop();
                    if (Integer.parseInt(tempStore) == currentSearch) 
                    {
                        currentSearch++;
                    } else 
                    {
                        Mountain.push(tempStore);
                        checkElse--;
                    }
                }
                else 
                {
                    checkElse--;
                }
                
                if (!Branch.isEmpty()) 
                {
                    tempStore = (String) Branch.pop();
                    if (Integer.parseInt(tempStore) == currentSearch) 
                    {
                        currentSearch++;
                    } else 
                    {
                        Branch.push(tempStore);
                        checkElse--;
                    }
                }
                else 
                {
                    checkElse--;
                }

                if (checkElse == 0) 
                {
                    if (!Mountain.isEmpty()) 
                    {
                        Branch.push(Mountain.pop());
                    }
                }
                /*
                //uncomment these to see how each variable changes step by step
                System.out.println("searchNum: "+currentSearch);
                System.out.println("checkElse: "+checkElse);
                System.out.println("Mountain: "+Mountain);
                System.out.println("Branch: "+Branch);
                System.out.println("\n");
                */
            }
            if (Mountain.isEmpty() && Branch.isEmpty())
                {
                    System.out.println("Y");
                }
                else
                {
                    System.out.println("N");
                }
            /*
            //uncomment these to print out whatever's left at the end.
            System.out.println("f Mountain: "+Mountain);
            System.out.println("f Branch: "+Branch);
            */
        }
    }
}
