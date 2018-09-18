package day.four.practice;

import java.util.Arrays;

public class JavaArrayTest {
	
	public static void main(String[] args) {
	
		duplicateElements();
		
		int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
	            
	    String[] my_array2 = {
	            "Java",
				
	            "Python",
	            "PHP",
	            "C#",
	            "C Programming",
	            "C++"
	        };
		
	    
	    
	    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
	    Arrays.sort(my_array1);
	    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
	    
	    System.out.println("Original string array : "+Arrays.toString(my_array2));
	    Arrays.sort(my_array2);
	    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
		
	}

	public static void duplicateElements() {
		
		String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu","jude","bcd"};
		
		for (int i = 0; i < my_array.length -1; i++ ) {
			
			for (int j = i + 1; j < my_array.length; j++) {
				
				if ((my_array[i].equals(my_array[j]))&& (i != j)) {
					System.out.println("Duplicate Elements are : " + my_array[j]);
				}
				
			}
			
			
		}
		
		
		
	}
	
	
}
