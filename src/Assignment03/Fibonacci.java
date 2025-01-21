package Assignment03;

import java.util.Scanner;

public class Fibonacci {
    // Recursive method to calculate the nth Fibonacci number
    public static int findFibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the position in the Fibonacci series
        System.out.print("Enter the position (n) in the Fibonacci series: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Invalid input! Please enter a non-negative integer.");
        } else {
            int result = findFibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is: " + result);
        }
        
        scanner.close();
    }
}
