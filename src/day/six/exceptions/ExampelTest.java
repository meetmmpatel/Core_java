package day.six.exceptions;

public class ExampelTest {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("First statement of try block");
			int num= 23/0;
			System.out.println(num);
		}
		catch(Exception e) {
			System.out.println("exceptions");
			
		}finally {
			System.  out.println("fianlly block");
		}
		
	}
	

}
