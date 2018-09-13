package dayOne.DataTypesandOperators;

public class Methods {

	// methods

	/*
	 * 1. Access modifier eg public ,private, default , protected 2. Return type =
	 * primitive or refernce 3. Name = Method name 4. parameters = list of
	 * parameters.
	 */

	public static void main(String[] args) {
		System.out.println(minfunction(10, 20, 30));
		
		Methods m1 = new Methods();
		m1.getNumbers();

	}

	public static void getNames() {
		System.out.println("This is the get names method");
	}

	public static int minfunction(int n1, int n2, int n3) {
		getNames();
		int sum = n1 + n2 + n3;
		return sum;
	}
	
	public void getNumbers() {
		System.out.println(24);
	}

}
