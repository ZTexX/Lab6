// Lab 6B

import java.util.Scanner;
import java.util.Random;

public class Lab6B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int userInput, guesses = 1, guess = 0;

        System.out.print("Enter a number between 1 and 1000: ");
        do {
            userInput = sc.nextInt();
        } while (userInput < 1 || userInput > 1000);

        while (guess != userInput) {
            guess = r.nextInt(1000) + 1;
            System.out.println("My guess was " + guess);
            guesses++;
        }

        System.out.print("\nI guessed the number was " + guess + " and it only took me " + guesses + " guesses");
    }
}
