package dayThree.ControlFlow;

public class JavaContinueWhileLoop {
	
	/*
	 Let’s say we have an array and we want to process only index numbers divided by 3. We can use java continue statement here with while loop.
	 */

	public static void main(String[] args) {
		int[] intArray = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int i = 0;
		while (i < 10) {

			if (i % 3 != 0) {
				i++;
				continue;
			}
			System.out.println("Processing Entry " + intArray[i]);
			i++;
		}
	}

}
