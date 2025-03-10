//17. Write a Java program to print the first N natural numbers, where N is provided by the user
import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
		 // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a value for N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Print the first N natural numbers
        System.out.println("The first " + N + " natural numbers are:");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
		// Close the scanner
        scanner.close();
    }
}
