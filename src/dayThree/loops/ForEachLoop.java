package dayThree.loops;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		int arr [] = {23,45,67,89};
		
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//for each or enhanced for loop
		for (int num : arr) {
			System.out.println("this is for each loop : " + num);
		}
		
		String str[] = {"Hello","Sample","Test"};
		
		for (String str1 : str) {
			System.out.println(str1);
		}
		
	}
	
	

}
