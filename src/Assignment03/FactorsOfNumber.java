package Assignment03;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        
        System.out.println("The factors of " + number + " are:");
        int factorCount = 0;

        // Find and print the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " "); // Print the factor
                factorCount++; // Increment the count of factors
            }
        }
        
        // Display the total number of factors
        System.out.println("\nTotal number of factors: " + factorCount);
        
        scanner.close();
    }
}
