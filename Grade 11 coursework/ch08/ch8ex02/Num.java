package ch8ex2;

public class Num {
    final private int i;
    
    //constructor
    public Num(){
        i = 123;
    }
    //constructor
    public Num(int integer){
        i = integer;
    }
    
    public int getDigit(int choice)
    {  
        switch (choice){
            default: return(i);
            case 1: return(i/100);
            case 2: return((i%100)/10);
            case 3: return((i%100)%10);
        }
    }
    public void explainRules()
    {
        System.out.println("Show (W)hole number. \nShow (H)undreds digit.");
        System.out.println("Show (T)ens digit. \nShow (O)nes digit.");
        System.out.println("(Q)uit");
    }
    
}
