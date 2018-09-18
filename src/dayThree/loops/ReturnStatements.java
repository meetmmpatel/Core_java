package dayThree.loops;

public class ReturnStatements {
	
	public static void main(String[] args) {
		System.out.println(sumOfDouble(23.98,45.76));
		
	}
	
	 static double sumOfDouble(double a, double b) {
		
		 double sum = a + b;
		
		return sum;
		
	}
	 
	 static void someTest(int i) {
		 if (i < 9)  return ;
		 ++i;
		 
	 }

}
