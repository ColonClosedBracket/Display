package ch5ex11;

import java.util.Scanner;

public class Ch5Ex11 {

    public static void main(String[] args) {
        double a,b,c,root1,root2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the a value: ");
        a = input.nextDouble();
        System.out.println("Enter the b value: ");
        b = input.nextDouble();
        System.out.println("Enter the c value: ");
        c = input.nextDouble();
        
        if ((b*b)-(4*a*c) > 0){
        root1 = ((-1*b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        root2 = ((-1*b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println("The roots are "+root1+" and "+root2);
        }
        else if ((b*b)-(4*a*c) == 0){
        root1 = ((-1*b))/(2*a);
        System.out.println("The only root is "+root1);
        }
        else{System.out.println("There are no real roots. ");}
    }
    
}
