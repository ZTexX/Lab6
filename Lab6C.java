// Lab 6C

import java.util.Scanner;

public class Lab6C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int selection = -1, balance = 1000;
        boolean goBack = true;

        System.out.println("Welcome!");
        System.out.println("You have $1000 in your account.");

        do {
            System.out.println("\nMenu");
            System.out.println("0 - Make a deposit");
            System.out.println("1 - Make a withdrawal");
            System.out.println("2 - Display account value");

            System.out.print("\nPlease make a selection: ");
            selection = sc.nextInt();

            if (selection == 0 || selection == 1) {
                if (selection == 0) {
                    System.out.print("How much would you like to deposit? : ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                } else {
                    System.out.print("How much would you like to withdraw? : ");
                    int withdrawal = sc.nextInt();
                    balance -= withdrawal;
                }

                System.out.println("Your current balance is $" + balance);
            } else if (selection == 2) {
                System.out.println("Your current balance is $" + balance);
            } else {
                System.out.println("Invalid entry, please try again.");
            }

            System.out.print("Would you like to return to the main menu (Y/N)? : ");
            goBack = sc.next().equalsIgnoreCase("y");
        } while (goBack);

        System.out.print("\nThank you for banking with us!");
    }
}
