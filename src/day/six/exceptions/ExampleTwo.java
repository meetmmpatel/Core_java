package day.six.exceptions;

public class ExampleTwo {

	public static void main(String[] args) {

		try {
			
			int a[] = new int[7];
			a[41] = 30 ;
			System.out.println("end of try block");
			
		}

		catch (ArithmeticException e) {
			System.out.println("Arithmatic exceptions ");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out side of range of an array");
		}

		catch (Exception e) {
			System.out.println("somthing went wrong");
		}

		System.out.println("out side of try catch block");

	}

}
