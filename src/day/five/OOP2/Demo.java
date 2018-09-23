package day.five.OOP2;

public class Demo {

	// this class is an example of Static and dianmic polymorphisum

	public static void main(String[] args) {

		SimpleCalculator obj = new SimpleCalculator();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));

	}

}

class SimpleCalculator {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
}
