package day.six.exceptions;

public class CustomExcepitons2 {
	
	void productCheck(int weight) throws InvalidProductException{
		
		if (weight < 100) {
			throw new InvalidProductException("Product is invalid");
		}
		
	}
	public static void main(String[] args) {
		CustomExcepitons2 obj = new CustomExcepitons2();
		try {
			obj.productCheck(60);
			System.out.println("Product is valid");
		}
		catch (Exception e) {
		System.out.println("Caugth the exceptions");
		System.out.println(e.getMessage());
		}
	}

}

class InvalidProductException extends Exception{
	
	public InvalidProductException (String s) {
		super(s);
	}
	
}
