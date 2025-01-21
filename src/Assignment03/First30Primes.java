package Assignment03;

public class First30Primes {
    public static void main(String[] args) {
        System.out.println("The first 30 prime numbers are:");

        int count = 0;  // To count the number of primes found
        int number = 2; // Start checking for primes from 2

        // Loop until we find 30 prime numbers
        while (count < 30) {
            if (isPrime(number)) {
                System.out.print(number + " "); // Print the prime number
                count++; // Increment the prime count
            }
            number++; // Check the next number
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors up to √num
            if (num % i == 0) {
                return false; // Not prime if divisible by any i
            }
        }
        return true; // Prime if no divisors found
    }
}

