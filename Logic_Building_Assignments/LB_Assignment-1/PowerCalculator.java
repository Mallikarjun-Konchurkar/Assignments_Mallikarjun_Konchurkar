//19.Write a Java program that calculates the power of a number. Take two numbers as input: the base and the exponent, and compute the result of base raised to the power of exponent.
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the base number
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        // Ask the user to enter the exponent
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate the power using Math.pow() function
        double result = Math.pow(base, exponent);

        // Print the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
