package checkersculminating;

import java.util.Scanner;
import java.util.ArrayList;

public class CheckersCulminating {
    //icons for each token
    static char p1tile = '0';
    static char p2tile = 'S';
    static char p1king = '@';
    static char p2king = '$';
    
    //for taking coordinates to  a global level
    static int selectedx;
    static int selectedy;
    
    //used to bring ints out to global lvl
    static int export;
    
    //checking during move to see what to put down
    static boolean isKing;
    
    public static void main(String[] args) {
        //initialization
        Board board = new Board(); 
        char[][] gameBoard = board.initBoard();
        board.explainRules();
        board.printBoard(gameBoard);
        
        
        //main loop
        while(gameOver(gameBoard) == 0)
        {
            p1turn(gameBoard);
            if (gameOver(gameBoard) == 0)p2turn(gameBoard);
        }
        System.out.print("\n\n P"+gameOver(gameBoard)+" wins!");
    }
    
    public static char[][] p1turn(char[][] gameBoard)
    {
        Board board = new Board();
        String choice;
        boolean invalid;
        //repeats until a vaild target exists
        Scanner input = new Scanner(System.in);
        //loop until valid input
        int c = 0;
        do{
        c++;
        invalid = false;
        if(c == 1) System.out.print("\nSelect a tile to move:    ");
        else
        {
            System.out.println("");//spacing
            board.printBoard(gameBoard);
            System.out.print("\nInvalid tile, try again:    ");
        }
        choice = input.next();
        if(choice.length() != 2) invalid = true;
        if (!(board.isValid(choice.toUpperCase().charAt(0),choice.charAt(1)))) invalid = true;
        
        //converts from a-h grid to actual numbers
        char charx = choice.toUpperCase().charAt(0);
        char chary = choice.charAt(1);
        int intx = (int)charx-65;
        int inty = (int)chary-49;
        
        //saving nums for out of loop operations
        selectedx = intx;
        selectedy = inty;
        
        //making sure you picked your own token
        //PLAYER DEPENDENT
        if (!board.isValid(intx, inty)) invalid = true;
        
        else if (gameBoard[intx][inty] != p1tile && gameBoard[intx][inty] != p1king) invalid = true; 
        //checking if you just keyboard mashed
        else if (checkMoves(gameBoard,intx,inty).length == 0) invalid = true; 
        }
        while(invalid);
        //valid target has been acquired
        
        //checks if you're moving a king or no
        //PLAYER DEPENDENT
        if(gameBoard[selectedx][selectedy] == p1king)
        {isKing = true;}
        else
        {isKing = false;}
        
        //giving list of options
        checkMoves(gameBoard,selectedx,selectedy);
        System.out.print("Possible moves: ");
        int max = 0;
        char[][] list = new char[5][2];
        for (int x = 0; x < checkMoves(gameBoard,selectedx,selectedy).length; x++)
        {
            max++;
            System.out.print("\n"+(x+1)+". ");
            System.out.print((char)(17+(checkMoves(gameBoard,selectedx,selectedy)[x][1])));
            list[x][0] = ((char)(17+(checkMoves(gameBoard,selectedx,selectedy)[x][1])));
            System.out.print((char)(1+(checkMoves(gameBoard,selectedx,selectedy)[x][0])));
            list[x][1] = ((char)(1+(checkMoves(gameBoard,selectedx,selectedy)[x][0])));
        }
        
        System.out.println("\nEnter which option you want: ");
        //loop until formatting is correct
        int f = 0;
        while (f == 0){
            try
            {   int x = input.nextInt()-1;
                if (x >= max)
                {   System.out.print("Invalid range! Please type one of the numbers given! ");
                    f = 0;}
                else{
                export = x;
                f = 1;}
            }
            catch(java.util.InputMismatchException j)
            {   System.out.println("\nInvalid formatting! Please type the number you want, \"1\", \"2\", etc.: ");
                input.nextLine();//clears error from try statement
                f = 0;}
            catch(java.lang.ArrayIndexOutOfBoundsException j)
            {   System.out.println("\nInvalid range! Please type one of the numbers given! ");
                input.nextLine();//clears error from try statement
                f = 0;}
        }
        int x = export;
        //erasing your selection from the board
        gameBoard[selectedx][selectedy] = '-';
        
        //upgrading to king
        //PLAYER DEPENDENT
        if((int)list[x][0]-65 == 0)
        {gameBoard[(int)list[x][0]-65][(int)list[x][1]-49] = p1king;}
        else if (isKing){gameBoard[(int)list[x][0]-65][(int)list[x][1]-49] = p1king;}
        //placing piece
        else gameBoard[(int)list[x][0]-65][(int)list[x][1]-49] = p1tile;
        
        
        //checking if you jumped
        if (Math.abs(((int)list[x][0]-65)-selectedx) == 2)
        {
            int modx;
            int mody;
            if((int)list[x][0]-65-selectedx < 0) modx = -1;
            else modx = 1;
            if((int)list[x][1]-49-selectedy < 0)mody = -1;            
            else mody = 1;
                
            //erasing the tile you go over
            gameBoard[selectedx+modx][selectedy+mody] = '-';
        }
        
        board.printBoard(gameBoard);
        //end of turn!
        return(gameBoard);
    }
    
    //should be the same as above except detecting/placing the opposite tiles
    public static char[][] p2turn(char[][] gameBoard)
    {
        //initializing
        Board board = new Board();
        String choice;
        boolean invalid;
        Scanner input = new Scanner(System.in);
        //loop until valid input
        int c = 0;
        do{
        c++;
        invalid = false;
        if(c == 1) System.out.print("\nSelect a tile to move:    ");
        else
        {
            System.out.println("");//spacing
            board.printBoard(gameBoard);
            System.out.print("\nInvalid tile, try again:    ");
        }
        choice = input.next();
        //checking for keyboard spam
        if(choice.length() != 2) invalid = true;
        //checking for if it's valid
        if (!(board.isValid(choice.toUpperCase().charAt(0),choice.charAt(1)))) invalid = true;
        
        //converting
        char charx = choice.toUpperCase().charAt(0);
        char chary = choice.charAt(1);
        int intx = (int)charx-65;
        int inty = (int)chary-49;
        
        //saving nums for out of loop operations
        selectedx = intx;
        selectedy = inty;
        
        //checking if it's truly yours
        //PLAYER DEPENDENT
        if (!board.isValid(intx, inty)) invalid = true;
        
        else if (gameBoard[intx][inty] != p2tile && gameBoard[intx][inty] != p2king) invalid = true; 
        
        //checking if it has any valid moves
        else if (checkMoves(gameBoard,intx,inty).length == 0) invalid = true; 
        
        }
        while(invalid);
        
        //keeping track what tile it needs to place
        //PLAYER DEPENDENT
        if(gameBoard[selectedx][selectedy] == p2king)
        {isKing = true;}
        else
        {isKing = false;}
        
        System.out.print("Possible moves: ");
        int max = 0;
        char[][] list = new char[5][2];
        //give list of options
        for (int x = 0; x < checkMoves(gameBoard,selectedx,selectedy).length; x++)
        {
            max++;
            System.out.print("\n"+(x+1)+". ");
            System.out.print((char)(17+(checkMoves(gameBoard,selectedx,selectedy)[x][1])));
            list[x][0] = ((char)(17+(checkMoves(gameBoard,selectedx,selectedy)[x][1])));
            System.out.print((char)(1+(checkMoves(gameBoard,selectedx,selectedy)[x][0])));
            list[x][1] = ((char)(1+(checkMoves(gameBoard,selectedx,selectedy)[x][0])));
        }
        
        System.out.println("\nEnter which option you want: ");
         //loop until formatting is correct
        int f = 0;
        while (f == 0){
            try
            {   int x = input.nextInt()-1;
                if (x >= max)
                {   System.out.print("Invalid range! Please type one of the numbers given! ");
                    f = 0;}
                else{
                export = x;
                f = 1;}
            }
            catch(java.util.InputMismatchException j)
            {   System.out.println("\nInvalid formatting! Please type the number you want, \"1\", \"2\", etc.: ");
                input.nextLine();//clears error from try statement
                f = 0;}
            catch(java.lang.ArrayIndexOutOfBoundsException j)
            {   System.out.println("\nInvalid range! Please type one of the numbers given! ");
                input.nextLine();//clears error from try statement
                f = 0;}
        }
        int x = export;
        //erase previous tile
        gameBoard[selectedx][selectedy] = '-';
        
        //upgrade to king
        //PLAYER DEPENDENT
        if((int)list[x][0]-72 == 0)
        {gameBoard[(int)list[x][0]-65][(int)list[x][1]-49] = p2king;}
        else if (isKing){gameBoard[(int)list[x][0]-65][(int)list[x][1]-49] = p2king;}
        //place normally
        else gameBoard[(int)list[x][0]-65][(int)list[x][1]-49] = p2tile;
        
        
        //checking for jump
        if (Math.abs(((int)list[x][0]-65)-selectedx) == 2)
        {
            int modx;
            int mody;
            if((int)list[x][0]-65-selectedx < 0) modx = -1;
            else modx = 1;
            if((int)list[x][1]-49-selectedy < 0)mody = -1;            
            else mody = 1;
                
            //erase jumped tile
            gameBoard[selectedx+modx][selectedy+mody] = '-';
        }
        board.printBoard(gameBoard);
        return(gameBoard);
    }
    
    //goes through all possible scenarios to check possibilities for a tile
    //should have made a seperate one to check jumps so i could implement chain jumps easier, but oh well
    public static int[][] checkMoves(char[][] gameBoard, int x, int y)
    {
        Board board = new Board();
        boolean good = false;
        //stops kings from jumping their own pieces
        
        ArrayList expandingMoves = new ArrayList();
        if (gameBoard[x][y] == p1tile)
        {
            for (int z = 1; z >= -1; z -= 2){
            //for normal pieces
            if (board.isValid(y-1*z,x-1)) //checks if off board
            {
                if(gameBoard[x-1][y-1*z] == p2tile || gameBoard[x-1][y-1*z] == p2king) //check if you can jump
                {
                    if (board.isValid(y-2*z,x-2) && gameBoard[x-2][y-2*z] == '-') //check if off board and if it's open to move there
                    {
                        expandingMoves.add((y-2*z)+""+(x-2)); //add to list of possible moves
                    }
                }
                else{
                    if (gameBoard[x-1][y-1*z] == '-')expandingMoves.add((y-1*z)+""+(x-1));}} //check if it's open to move if you can't jump
            }
        }
        else if (gameBoard[x][y] == p2tile) //same as above but for other pieces/direction
        {
            for (int z = 1; z >= -1; z -= 2){
            //for normal pieces
            if (board.isValid(y-1*z,x+1))
            {
                if(gameBoard[x+1][y-1*z] == p1tile || gameBoard[x+1][y-1*z] == p1king)
                {
                    if (board.isValid(y-2*z,x+2) && gameBoard[x+2][y-2*z] == '-')
                    {
                        expandingMoves.add((y-2*z)+""+(x+2));
                    }
                }
                else{
                    if (gameBoard[x+1][y-1*z] == '-')expandingMoves.add((y-1*z)+""+(x+1));}}
            }
        }
        else if (gameBoard[x][y] != '-') //check if there's a token
        {
            for (int z = 1; z >= -1; z -= 2){
            for (int f = 1; f >= -1; f -= 2){
            //for kings
            if (board.isValid(y-1*z,x-1*f)) //check if on the board
            {
                if(gameBoard[x-1*f][y-1*z] != '-') //check if open
                {
                    if (gameBoard[x][y] == p1king) //check what player it's for
                    {
                        if(gameBoard[x-1*f][y-1*z] == p2tile || gameBoard[x-1*f][y-1*z] == p2king)good = true; //check if you can jump it
                    }
                    else if (gameBoard[x][y] == p2king) //check what player it's for
                    {
                        if(gameBoard[x-1*f][y-1*z] == p1tile || gameBoard[x-1*f][y-1*z] == p1king)good = true; //check if you can jump it
                    }
                    if (good && board.isValid(y-2*z,x-2*f) && gameBoard[x-2*f][y-2*z] == '-') //if open, valid, and passed teh above tests
                    {
                        expandingMoves.add((y-2*z)+""+(x-2*f)); //add jump as an option
                    }
                }
                else{
                    if (gameBoard[x-1][y-1] == '-')expandingMoves.add((y-1)+""+(x-1));}} //if can't jump, check if normal move is valid
            }
            }
        }
        
        int[][] possibleMoves = new int[expandingMoves.size()][2];
        if (expandingMoves.size() != 0)
        {
            for (int z = 0; z < expandingMoves.size(); z++) 
            {
            possibleMoves[z][0] = (int)(expandingMoves.get(z)+"").charAt(0);
            possibleMoves[z][1] = (int)(expandingMoves.get(z)+"").charAt(1);
            }
        }
        return(possibleMoves);
    }
    
    //check if gameOver
    //game ends if there's no possible moves or no tiles left
    public static int gameOver(char[][] gameBoard)
    {
        //setting win to true, so it can be ruined by the ifs
        boolean p1win = true;
        boolean p2win = true;
        
        for (int x = 0; x < gameBoard.length; x++)
        {
            for (int y = 0; y < gameBoard.length; y++)
            {
                if (gameBoard[x][y] == p1tile || gameBoard[x][y] == p1king)
                {
                    if(checkMoves(gameBoard,x,y).length != 0)
                    {
                        p2win = false;
                    }
                } //if there's still a p1 on the board that can move, you don't win yet
                if (gameBoard[x][y] == p2tile || gameBoard[x][y] == p2king)
                {
                    if(checkMoves(gameBoard,x,y).length != 0)
                    {
                        p1win = false;
                    }
                } // if there's still a p2 on the board that can move, you don't win yet
                
            }
        }
        if(p1win) return(1);
        if(p2win) return(2);
        return(0);
    }
}