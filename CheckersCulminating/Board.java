package checkersculminating;

import java.util.Scanner;

public class Board {
    
    public Board(){
        
    }
    public boolean isValid(int x, int y)
    {
        //checks if a number is in constraints
        if (x < 0 || x > 7) return(false);
        if (y < 0 || y > 7) return(false);
        return(true);
    }
    public boolean isValid(char x, char y)
    {
        //checks if in constraints, also translates from the a-h grid
        int intx = (int)x-65;
        int inty = (int)y-49;
        if (intx < 0 || intx > 7) return(false);
        if (inty < 0 || inty > 7) return(false);
        return(true);
    }
    public char[][] initBoard()
    {
        //making blank board
        char[][] board = new char[8][8];
        for (int x = 0; x <= 7; x++)
        {
            for (int y = 0; y <= 7; y++)
            {
                board[x][y] = '-';
            }
        }
        //adding normal player pieces
        ///*
        for(int x = 0; x <= 7; x+=2)
        {board[7][x] = '0';}
        for(int x = 1; x <= 7; x+=2)
        {board[6][x] = '0';}
        for(int x = 0; x <= 7; x+=2)
        {board[5][x] = '0';}    
        
        for(int x = 1; x <= 7; x+=2)
        {board[0][x] = 'S';}
        for(int x = 0; x <= 7; x+=2)
        {board[1][x] = 'S';}
        for(int x = 1; x <= 7; x+=2)
        {board[2][x] = 'S';}
        //*/
        
        //FOR TESTING PURPOSES
        /*board[7][3] = '@';
        board[6][2] = '$';
        board[0][0] = 'S';
        board[1][1] = '0';
        board[2][2] = '0';*/
        
        return(board);
    }
    public void printBoard()
    {
        //prints a blank board
        Board board2 = new Board();
        char[][] board = board2.initBoard();
        System.out.print(" ");
        for (int z = 1; z <= 8; z++)
            {
                System.out.print(" "+z);
            }
        System.out.println();
        for (int x = 0; x <= 7; x++)
        {
            System.out.print((char)(x+65));
            for (int y = 0; y <= 7; y++)
            {
                System.out.print(" "+board[x][y]);
            }
            System.out.println();
        }
    }
    public void printBoard(char[][] board)
    {
        //prints an array with the a-h grid around it
        System.out.print(" ");
        for (int z = 1; z <= 8; z++)
            {
                System.out.print(" "+z);
            }
        System.out.println();
        for (int x = 0; x <= 7; x++)
        {
            System.out.print((char)(x+65));
            for (int y = 0; y <= 7; y++)
            {
                System.out.print(" "+board[x][y]);
            }
            System.out.println();
        }
    }
    
    public void explainRules()
    {
        //wall of text with rules
        Scanner input = new Scanner(System.in);
        System.out.println("In this game of checkers, your goal is to capture all enemy pieces! ");
        System.out.println("You do this by first typing the coordinates of the piece you want to move.");
        System.out.println("Then, you choose where it will go.  ");
        System.out.println("Then it moves, and it's the other player's turn! ");
        System.out.println("Things to note: ");
        System.out.println("Player 1 has 0 as a mark for its pawns, and an @ for it's kings.  ");
        System.out.println("Player 2 has S as a mark for its pawns, and an $ for it's kings.  ");
        System.out.println("Forced jump is off, and you cannot double or triple jump. ");
        System.out.print("That's all for rules! Press enter when you're ready!");
        input.nextLine();
    }
    
    
}
