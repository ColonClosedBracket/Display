package ch8ex8;

public class Ch8Ex8 {

    public static void main(String[] args) {
        Adder add = new Adder();
        int points = 0;
        int adding;
        boolean runGame = true;
        
        System.out.println("Enter 999 at any time to quit. ");
        while(runGame)
        {
            add.makeQuestion();
            adding = add.getAnswer();
            if (adding == 999)
            {
                System.out.println("Your score is "+points);
                runGame = false;
            }
            else
            {
                points += adding;
            }
            
        }
    }
    
}

/*adder asks question
    if right it returns points
    if 999 it returns 999
    if wrong it reduces and tries again
    if points < 0 it makes a new question
if points return 999 quit
    show points
else points are added to score */