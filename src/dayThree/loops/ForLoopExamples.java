package dayThree.loops;

public class ForLoopExamples {

	// for (initilized : condition: incrementOr decrement){
	// }

	public static void main(String[] args) {

		sumOfall();
		fibonacci();

		for (int i = 0; i <= 10; i++) {
			System.out.println("The value of I is : " + i);

		}

	}

	public static void sumOfall() {

		int num = 20;
		int count;
		int total = 0;

		for (count = 1; count <= num; count++) {

			total = total + count;

		}

		System.out.println(total);

	}
	
	public static void fibonacci() {
		
		int count = 7;
		int num1 = 0;
		int num2 = 1;

		for (int i = 1; i <= count; ++i) {
			System.out.println(num1 +  " ");
			int sumOfPreTwo = num1 + num2;
			
			num1 = num2;
			num2 = sumOfPreTwo;
			
			
			
		}
		
		
	}
	

}
