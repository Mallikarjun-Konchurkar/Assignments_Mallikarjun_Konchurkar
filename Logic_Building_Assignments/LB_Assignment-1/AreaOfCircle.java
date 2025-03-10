//9. Write a Java program that calculates the area of a circle.
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Input the radius: ");
        double radius = scanner.nextDouble();
        
        // Calculating area of the circle
        double area = Math.PI * Math.pow(radius, 2);
        
        // Displaying the result
        System.out.println("Area of the circle: " + area);
        
        scanner.close();
    }
}