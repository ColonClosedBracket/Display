package ch6ex3;

public class Ch6Ex3 {

    public static void main(String[] args) {
        double Investment = 2500;
        int years = 0;
        while (Investment < 5000)
        {
            Investment *= 1.075;
            years++;
        }
        System.out.println("It took "+years+" years to go from 2500$ to "+Investment+"$.");
    }    
}
