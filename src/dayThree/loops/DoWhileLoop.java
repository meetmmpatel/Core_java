package dayThree.loops;

import java.util.Arrays;

public class DoWhileLoop {

	public static void main(String[] args) {
		int i = 10;
		do {
			System.out.println(i);
			i--;
		}
		while (i > 2);
		
		

		int arr[] = { 2, 4, 9, 5, 6, 7, 8 };

		int j = 0;
		do {
			Arrays.sort(arr);
			System.out.println(arr[j]);
			j++;
		}
		while (j < arr.length);

	}

}
