package day.six.exceptions;

public class ExampleOne {
	
	public static void main(String[] args) {
		
			int num1;
			int num2;
			
			try {
				num1 = 0;
				num2 = 23/num1;
				System.out.println(num2);
				System.out.println("this is end of try block");
				
			}
			catch(ArithmeticException e){
				System.out.println("You can not divide number by zero");
			}
			catch (Exception e) {
				System.out.println("exception occured");
			}
			
		System.out.println("out side of try catch block");
		
	}

}
