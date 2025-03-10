//16.Write a Java program to check whether a number is prime or not.
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
		 // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number to check if it's prime: ");
        int num = scanner.nextInt();

        // A prime number is greater than 1 and divisible only by 1 and itself
        boolean isPrime = true;

        // Check if the number is less than or equal to 1 (not prime)
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check for factors other than 1 and the number itself
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print whether the number is prime or not
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
         // Close the scanner
        scanner.close();
    }
}
