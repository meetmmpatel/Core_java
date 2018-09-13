package dayThree.ControlFlow;

import java.util.Arrays;

public class JavaContinueLabel {

	public static void main(String[] args) {

		int[][] intArr = { { 1, -2, 3 }, { 0, 3 }, { 1, 2, 5 }, { 9, 2, 5 } };

		process: for (int i = 0; i < intArr.length; i++) {
			boolean allPositive = true;
			for (int j = 0; j < intArr[i].length; j++) {
				if (intArr[i][j] < 0) {
					allPositive = false;
					continue process;
				}
			}
			if (allPositive) {
				// process the array
				System.out.println("Processing the array of all positive ints. " + Arrays.toString(intArr[i]));
			}
			allPositive = true;
		}

	}
}