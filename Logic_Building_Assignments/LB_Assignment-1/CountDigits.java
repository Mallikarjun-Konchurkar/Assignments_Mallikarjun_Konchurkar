//20. Write a Java program that counts the number of digits in a given number.
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
		 // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize a variable to count the digits
        int count = 0;

        // Check if the number is zero
        if (number == 0) {
            count = 1; // Zero has one digit
        } else {
            // Count the digits by dividing the number by 10 in each iteration
            while (number != 0) {
                number /= 10; // Remove the last digit
                count++; // Increment the count
            }
        }

        // Print the number of digits
        System.out.println("The number of digits is: " + count);
         // Close the scanner
        scanner.close();
    }
}
