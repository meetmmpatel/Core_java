package dayThree.ControlFlow;

public class SwitchCaseExampelOne {

	/*
	 * switch (variable or an integer expression) { case constant: //Java code ;
	 * case constant: //Java code ; default: //Java code ; }
	 * 
	 */

	public static void main(String[] args) {

		int num = 0;

		switch (num + 2) {
			case 3:
				System.out.println("Case3: Value is: " + num);
				break;

			case 2:
				System.out.println("Case 2  " + num);
				break;
			case 1:
				System.out.println("Case 1  " + num);
				break;

			default:
				System.out.println("Default: Value is: " + num);

		}

	}

}
