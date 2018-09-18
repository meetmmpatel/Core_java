package dayThree.loops;

public class BreakStatment {

	public static void main(String[] args) {

		labeledBreakStatment();
		int num = 0;
		while (num <= 100) {
			System.out.println("Value of variable is: " + num);
			if (num == 2) {
				break;
			}
			num++;
		}
		System.out.println("Out of while-loop");

	}
	
	public static void labeledBreakStatment() {
		 first:
		      for( int i = 1; i < 5; i++) {

		         second:
		         for(int j = 1; j < 3; j ++ ) {
		            System.out.println("i = " + i + "; j = " +j);
		             
		            if ( i == 2)
		            break second;
		         }
		      }
		
		
	}

}
