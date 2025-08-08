package ch6test;

import java.util.Scanner;

public class Ch6test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String oldPassword, newPassword;
        System.out.print("Enter your old password: ");
        oldPassword = input.nextLine();
        System.out.print("Enter your new password: ");
        newPassword = input.nextLine();

        if (CheckPassword(oldPassword, newPassword)) System.out.println("Password accepted! ");
        else System.out.println("Password not accepted!");
        

    }

    public static boolean CheckPassword(String oldPassword, String newPassword) {

        if (newPassword.length() < 7) {
            System.out.println("Password needs to be at least 7 characters. ");
            return (false);
        } //checking this first to avoid index errors later

        //Is it the same?
        if (newPassword.equals(oldPassword)) {
            System.out.println("Password needs to be different. ");
            return (false);
        }

        //Are the first 4 the same
        if (oldPassword.length() < 4) {}
        else if (newPassword.substring(0, 3).equals(oldPassword.substring(0, 3))) {
                System.out.println("The first 4 letters in the password need to be different. ");
                return (false);
            }

        //Does it end in a number
        boolean confirm = true;
        for (int x = 0; x < 10; x++) {
            if (newPassword.indexOf(((char) (x + 48)), newPassword.length() - 1) != -1) {
                confirm = false;
            }
        }
        if (confirm) {
            System.out.println("The password needs to end in a number. ");
            return (false);
        }

        //Does it start with !#$*
        if (!newPassword.substring(0, 1).equals("!") && !newPassword.substring(0, 1).equals("#") && !newPassword.substring(0, 1).equals("$") && !newPassword.substring(0, 1).equals("*")) {
            {
                System.out.println("The password needs to start wih !, #, $, or * ");
                return (false);
            }
        }

        //Does it have spaces
        if (newPassword.contains(" ")) {
            System.out.println("The password can't contain spaces. ");
            return (false);
        }

        //Does it have caps
        if (newPassword.toLowerCase().equals(newPassword)) {
            System.out.println("The password must have a capital letter. ");
            return (false);
        }

        //Is it symnetrical
        String word = newPassword.substring(1, newPassword.length() - 1);
        for (int x = 0; x < word.length() / 2; x++) {

            if (!word.substring(x, x + 1).equals(word.substring(word.length() - x - 1, word.length() - x))) {
                System.out.println("The password must be symnetrical apart from the first and last character. ");
                return (false);
            }
        }

        return (true);
    }

}
