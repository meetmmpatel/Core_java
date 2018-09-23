package day.six.exceptions;

import java.util.Scanner;

public class FinallyExample {

	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		myMethod();
	}

	public static int myMethod() {

		try {
			//
			System.exit(0);
			return 112;

		}
		finally {
			scan.close();
			System.out.println("This is Finally block");
			System.out.println("Finally block ran even after return statement");
		}
	}

}
