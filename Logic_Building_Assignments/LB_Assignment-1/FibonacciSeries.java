//14. Print the Fibonacci Series
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
		 // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many terms of the Fibonacci series they want
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Initialize the first two terms of the Fibonacci series
        int first = 0, second = 1;

        // Print the Fibonacci series
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            
            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }
          // Close the scanner
            scanner.close();
    }
}
