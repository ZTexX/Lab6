// Lab 6A

import java.util.Scanner;

public class Lab6A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= largest) {
                largest = numbers[i];
            }
        }

        System.out.print("\nThe largest number was " + largest);
    }
}
