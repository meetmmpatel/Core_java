package dayTwo.ControlFlow;

public class ControlFlow {

	/*
	 * a) if statement b) nested if statement c) if-else statement d) if-else-if
	 * statement
	 */

	public static void main(String[] args) {
		
		Methods.getNames("Sample Test");
		Methods mt = new Methods();
		System.out.println(mt.getNumbers(35));
		
		
		ControlFlow cf = new ControlFlow();
		cf.getOne(89);
		cf.nestedIf();
		staticMethod();
		cf.ifElseStatement();
		cf.IfElseIfExample();
	}

	public static void staticMethod() {
		System.out.println("this is static method");
	}

	public void getOne(int num1) {

		int num = num1;
		if (num < 100) {
			System.out.println("Number is less than 100");
		}

	}

	public void nestedIf() {

		int num = 70;
		if (num < 50) {
			System.out.println("number is less then 100");

			if (num > 50) {
				System.out.println("number is greter than 50");
			}

		}
	}
	
	
	public void ifElseStatement() {
		int num = 120;
		if(num < 50) {
			System.out.println("Num is less then 50");
		}
		else {
			System.out.println("Num is greater then of equel to 50");
		}
		
	}
	
	
	public void IfElseIfExample() {
		int num = 1234;
		
		if (num < 100 && num >= 1) {
			System.out.println("it's tow digit number");
			
		}
		else if (num < 1000 && num >= 100) {
			System.out.println("its' three digit numbers");
		}
		
		else if (num < 10000 && num >= 1000) {
			System.out.println("it'd four digit numbers");
		}
		else if (num < 100000 && num >= 10000) {
			System.out.println("it's five digit numbers");
		}
		else {
			System.out.println("number is not between 1 & 99999");
		}
		
	}
	
	
	
	//Use any of if else statments
	//1. our three numbers find the largest numbers
	// 2. for any number positive or nagative 
	//3. find the numbers even or odd..
	
	
	
	
	
	
	
	
	

}
