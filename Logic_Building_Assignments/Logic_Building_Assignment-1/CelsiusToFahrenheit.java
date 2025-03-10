//18.Write a Java program to convert a temperature from Celsius to Fahrenheit.
import java.util.Scanner;

public class CelsiusToFahrenheit {
	 // Create a scanner object to take input from the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Print the result
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        // Close the scanner
        scanner.close();
    }
}
