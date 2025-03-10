//5.Write a Java program that takes two numbers as input and displays the product of the two numbers.
import java.util.Scanner;

public class MultiplyOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Calculating product
        int product = num1 * num2;
        
        // Printing result
        System.out.println("Product: " + product);
        
        scanner.close();
    }
}
