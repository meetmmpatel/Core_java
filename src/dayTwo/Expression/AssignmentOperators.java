package dayTwo.Expression;

public class AssignmentOperators {

	// Assignments operators in java are: =, +=, -=, *=, /=, %=

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		num2 = num1;
		System.out.println(num2);

		num2 += num1;
		System.out.println(num2);

		num2 -= num1;
		System.out.println(num2);
		
		num2 *= num1;
		System.out.println(num2);

		num2 /= num1;
		System.out.println(num2);

		num2 %= num1;
		System.out.println(num2);

	}

}
