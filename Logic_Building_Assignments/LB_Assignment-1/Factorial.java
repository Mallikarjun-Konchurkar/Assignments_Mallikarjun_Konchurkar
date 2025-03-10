//15.Write a Java program to find the factorial of a number.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
		 // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();

        // Check if the number is negative
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Variable to store the factorial result
            long factorial = 1;

            // Calculate the factorial using a for loop
            for (int i = 1; i <= num; i++) {
                factorial *= i; // Multiply factorial by each number from 1 to num
            }

            // Print the factorial result
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
         // Close the scanner
        scanner.close();
    }
}
