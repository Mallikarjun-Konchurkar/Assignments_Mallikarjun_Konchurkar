//8. Write a Java program to swap the values of two variables without using a third variable
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        
        // Display before swapping
        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        // Swapping without using a third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        // Display after swapping
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        scanner.close();
    }
}