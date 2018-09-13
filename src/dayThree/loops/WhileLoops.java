package dayThree.loops;

public class WhileLoops {
	
	
	
	public static void main(String[] args) {
		
		whileLoopWithArray();
		int i = 10;
		while (i > 1) {
			System.out.println(i);
			i--;
		}
		
	}
	
	public static void whileLoopWithArray() {
		
		int arr[] = {23,32,56,78,67};
		
		int num = 0;
		while(num < arr.length) {
			System.out.println(arr[num]);
			num++;
		}
		

	}
	

}
