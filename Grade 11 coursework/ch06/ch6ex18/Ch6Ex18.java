package ch6ex18;

import java.util.Scanner;

public class Ch6Ex18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fname, mname, lname;
        System.out.print("Enter your first name: ");
        fname = input.next();
        System.out.print("Enter your middle initial: ");
        mname = input.next();
        System.out.print("Enter your last name: ");
        lname = input.next();
        
        System.out.print("\n Your monogram is: "+fname.substring(0,1).toLowerCase()+lname.substring(0,1).toUpperCase()+mname.substring(0,1).toLowerCase());
//fname.substring(0,1).toLowerCase() takes the name, then takes the first letter with substr, then corrects case.
    }
    
}
