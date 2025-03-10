//12. Write a Java program that takes a number as input and prints the reverse of that number.
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the number as input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Variable to store the reversed number
        int reversed = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;           // Get the last digit of the number
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            num = num / 10;                  // Remove the last digit from the number
        }

        System.out.println("The reverse of the number is: " + reversed);

        scanner.close();
    }
}
