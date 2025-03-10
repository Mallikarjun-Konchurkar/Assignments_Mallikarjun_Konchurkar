//Write a Java program to divide two numbers and print the result on the screen.import java.util.Scanner;
class DivisionOfTwoNumbers
   {
     public static void main(String args[])
      {
         int num1,num2,divide;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter First Number : ");
		 num1=sc.nextInt();
         System.out.println("Enter Second Number : ");
		 num2=sc.nextInt();
		 divide=num1+num2;
   
        System.out.println("Division of " + num1 + " and " + num2 + " is " + divide);
   	 
	     sc.close();
        }
}