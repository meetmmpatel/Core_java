package day.four.practice;

import java.util.Scanner;

public class ControlFlow {
	public static void main(String[] args) {
		
		sameNumbers();
		Scanner in = new Scanner(System.in);
		System.out.print("Input value: ");
		double input = in.nextDouble();

		if (input > 0) {
			if (input < 1) {
				System.out.println("Positive small number");
			}
			else if (input > 1000000) {
				System.out.println("Positive large number");
			}
			else {
				System.out.println("Positive number");
			}
		}
		else if (input < 0) {
			if (Math.abs(input) < 1) {
				System.out.println("Negative small number");
			}
			else if (Math.abs(input) > 1000000) {
				System.out.println("Negative large number");
			}
			else {
				System.out.println("Negative number");
			}
		}
		else {
			System.out.println("Zero");
		}
	}
	
	public static void sameNumbers() {
	
			 Scanner in = new Scanner(System.in);
			 System.out.print("Input first number: ");
	         int num1 = in.nextInt();
	         System.out.print("Input second number: ");
	         int num2 = in.nextInt();
			 System.out.print("Input third number: ");
	         int num3 = in.nextInt();
	         System.out.print("Input fourth number: ");
	         int num4 = in.nextInt();		
			
			if (num1 == num2 && num2 == num3 && num3 == num4) 
			  {
				System.out.println("Numbers are equal.");
	                               }
			else
				{
				System.out.println("Numbers are not equal!");
			}
		
		
	}

}










