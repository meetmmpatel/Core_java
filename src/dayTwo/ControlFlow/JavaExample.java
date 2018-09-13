package dayTwo.ControlFlow;

import java.util.Scanner;

public class JavaExample {

	public static void main(String[] args) {

		JavaExample jx = new JavaExample();
		jx.largestNumber();
		jx.findThePositiveOrNagative();
		jx.evenOROddConditions();

	}

	public void largestNumber() {
		int num1 = 10, num2 = 70, num3 = 70;

		if (num1 >= num2 && num1 >= num3)
			System.out.println(num1 + " is the largest Number");

		else if (num2 >= num1 && num2 >= num3)
			System.out.println(num2 + " is the largest Number");

		else
			System.out.println(num3 + " is the largest Number");

	}

	public void findThePositiveOrNagative() {

		int number = 99;
		if (number > 0) {
			System.out.println(number + " is a positive number");
		}
		else if (number < 0) {
			System.out.println(number + " is a negative number");
		}
		else {
			System.out.println(number + " is neither positive nor negative");
		}

	}

	public void evenOROddConditions() {
		int num;
		System.out.println("Enter an Integer number:");

		// The input provided by user is stored in num
		Scanner input = new Scanner(System.in);
		num = input.nextInt();

		/*
		 * If number is divisible by 2 then it's an even number else odd number
		 */
		if (num % 2 == 0)
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");
	}

}
