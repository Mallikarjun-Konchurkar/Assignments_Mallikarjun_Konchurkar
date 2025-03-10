//13. Calculate the Average of Three Numbers
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
         // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take three numbers as input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the average of the three numbers
        double average = (num1 + num2 + num3) / 3;

        // Print the average
        System.out.println("The average of the three numbers is: " + average);

        // Close the scanner
        scanner.close();
    }
}
