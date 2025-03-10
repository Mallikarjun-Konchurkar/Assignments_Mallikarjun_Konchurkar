//Write a Java program to print the sum of two numbers.
import java.util.Scanner;
class SumOfTwoNumbers
   {
     public static void main(String args[])
      {
         int num1,num2,sum;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter First Number : ");
		 num1=sc.nextInt();
         System.out.println("Enter Second Number : ");
		 num2=sc.nextInt();
		 sum=num1+num2;
   
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
   	 
	     sc.close();
        }
}