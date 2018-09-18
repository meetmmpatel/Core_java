package dayThree.loops;

public class ContinueStatment {

	public static void main(String[] args) {
//		ContinueExample2();

		 for (int i = 1; i <= 10; ++i) {      
	         if (i > 4 && i < 9) {
	            continue;
	         }      
	         System.out.println(i);
	      }

		}

	

	public static void ContinueExample2() {
		int counter = 10;
		while (counter >= 0) {
			if (counter == 7) {
				counter--;
				continue;
			}
			System.out.print(counter + " ");
			counter--;
		}

	}

}
