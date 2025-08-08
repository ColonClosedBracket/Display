package ch10ex15;

import java.util.Scanner;

public class Ch10Ex15 {

    public static void main(String[] args) {
        int[] board = new int[14];
        board = startSetup(board);
        int activePlayer = 0;
        int overflow = 0;
        boolean gameRun = true;
        
        p(board);
        
        
        while (gameRun)
        {
            //turn taking!
            while (activePlayer == 0) 
            {
                System.out.println("P1 Turn");
                int tile = getInput(0);
                for (int x = 0; x < board[tile]; x++) 
                {
                    if (tile+x < 14) board[tile + x] += 1;
                    else{ 
                        overflow = board[tile] - x;
                        break;
                    }
                }
                for (int x = 0; x < overflow; x++)
                {
                    board[x] += 1;
                }
                overflow = 0;
                System.out.print(tile + board[tile] - 1);
                if (board[tile] == 0 || tile + board[tile] > 14){
                    activePlayer = 1;}
                else if (tile + board[tile] - 1 == 6) 
                {
                    activePlayer = 0;
                }
                else if (board[tile + board[tile] - 1] == 1) 
                {
                    if ((tile + board[tile] - 1) < 6 && (tile + board[tile] - 1) >= 0) 
                    {
                        switch (tile + board[tile] - 1) 
                        {
                            case 0: board[6] += board[12]; board[12] = 0; break;
                            case 1: board[6] += board[11]; board[11] = 0; break;
                            case 2: board[6] += board[10]; board[10] = 0; break;
                            case 3: board[6] += board[9]; board[9] = 0; break;
                            case 4: board[6] += board[8]; board[8] = 0; break;
                            case 5: board[6] += board[7]; board[7] = 0; break;
                            case 7: board[13] += board[5]; board[5] = 0; break;
                            case 8: board[13] += board[4]; board[4] = 0; break;
                            case 9: board[13] += board[3]; board[3] = 0; break;
                            case 10: board[13] += board[2]; board[2] = 0; break;
                            case 11: board[13] += board[1]; board[1] = 0; break;
                            case 12: board[13] += board[0]; board[0] = 0; break;
                        }
                        activePlayer = 1;
                    }
                }
                else
                {
                    activePlayer = 1;
                }
                board[tile] = 0;
                p(board);
            }
            //checking for end of the game
            if (checkEnd(board) != 0)
            {
                activePlayer = 2*checkEnd(board);
                gameRun = false;
            }
            //turn taking!
            while (activePlayer == 1) 
            {
                System.out.println("P2 Turn");
                int tile = getInput(1);
                for (int x = 0; x < board[tile]; x++) 
                {
                    if (tile+x < 14) board[tile + x] += 1;
                    else{ 
                        overflow = board[tile] - x;
                        break;
                    }
                }
                for (int x = 0; x < overflow; x++)
                {
                    board[x] += 1;
                }
                overflow = 0;
                if (board[tile] == 0 || tile + board[tile] > 14){
                    activePlayer = 0;}
                else if (tile + board[tile] - 1 == 13) 
                {
                    activePlayer = 1;
                }
                else if (board[tile + board[tile] - 1] == 1) 
                {
                    if (tile + board[tile] - 8 < 6 && tile + board[tile] - 8 >= 0) 
                    {
                        switch (tile + board[tile] - 1) 
                        {
                            case 0: board[6] += board[12]; board[12] = 0; break;
                            case 1: board[6] += board[11]; board[11] = 0; break;
                            case 2: board[6] += board[10]; board[10] = 0; break;
                            case 3: board[6] += board[9]; board[9] = 0; break;
                            case 4: board[6] += board[8]; board[8] = 0; break;
                            case 5: board[6] += board[7]; board[7] = 0; break;
                            case 7: board[13] += board[5]; board[5] = 0; break;
                            case 8: board[13] += board[4]; board[4] = 0; break;
                            case 9: board[13] += board[3]; board[3] = 0; break;
                            case 10: board[13] += board[2]; board[2] = 0; break;
                            case 11: board[13] += board[1]; board[1] = 0; break;
                            case 12: board[13] += board[0]; board[0] = 0; break;
                        }
                        activePlayer = 0;
                    }
                }
                else
                {
                    activePlayer = 0;
                }
                board[tile] = 0;
                p(board);
            }
            
            //checking for end of the game
            if (checkEnd(board) != 0)
            {
                activePlayer = 2*checkEnd(board);
                gameRun = false;
            }
        }
        //System.out.println("Game has ended. ");
        //p(board);
        if (activePlayer == -2)
        {
            for (int x = 0; x < 6; x++)
            {
                board[6] += board [x];
                board[x] = 0;
            }
        }
        else if (activePlayer == 2)
        {
            for (int x = 7; x < 13; x++)
            {
                board[13] += board [x];
                board[x] = 0;
            }
        }
        p(board);
        System.out.println("Final score:  ");
        if (board[6] > board[13])
        {
            System.out.println("P1 wins "+board[6]+" to "+board[13]);
        }
        else if (board[6] < board[13])
        {
            System.out.println("P2 wins "+board[13]+" to "+board[6]);
        }
        else
        {
            System.out.println("It's a tie, both players got "+board[6]);
        }
        

    }
    
    //makes board
    public static int[] startSetup(int[] board)
    {
        for (int y = 0; y <= 1; y++) 
        {
            for (int x = 0; x < 6; x++) 
            {
                board[x + y*7] = 3;
            }
        }
        return(board);
    }
    
    public static int checkEnd(int[] board)
    {
        int whoCleared = 1;
        for (int x = 0; x < 6; x++)
        {
            if (board[x] != 0)
            {whoCleared = 0;}
        }
        if (whoCleared == 1) return(1);
        whoCleared = 1;
        for (int x = 7; x < 13; x++)
        {
            if (board[x] != 0)
            {whoCleared = 0;}
        }
        if (whoCleared == 1) return(-1);
        return(0);
    }
    
    //gets pit value
    public static int getInput(int player)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a pit to choose from: ");
        char x = input.next().toLowerCase().charAt(0);
        int y = (int)x - 97;
        if (player == 0)
        {
            return(y);
        }
        if (player == 1)
        {
            return(12-y);
        }
        else return(0);
    }
    
    public static void p(int[] board)
    {
        System.out.format("%-4s %-2s %-2s %-2s %-2s %-2s %-2s","\n","A","B","C","D","E","F");
        System.out.format("%-4s %-2s %-2s %-2s %-2s %-2s %-2s","\n",board[12],board[11],board[10],board[9],board[8],board[7]);
        System.out.format("%-2s %-18s %-2s","\n", board[13],board[6]);
        System.out.format("%-4s %-2s %-2s %-2s %-2s %-2s %-2s","\n",board[0],board[1],board[2],board[3],board[4],board[5]);
        System.out.format("%-4s %-2s %-2s %-2s %-2s %-2s %-2s","\n","A","B","C","D","E","F");
        System.out.println("");
        
    }
    
}
