package day.eight.collections;

import java.util.ArrayList;

public class ListMethods {
	
	public static void main(String[] args) {
		 ArrayList<Integer> list1 = new ArrayList<>();
		 
		 list1.add(3);
		 list1.add(5);
		 list1.add(34);
		 
		 ArrayList<Integer> list2 = new ArrayList<>();
		 
		 list2.add(100);
		 list2.add(300);
		 System.out.println(list1);
		 list1.addAll(list2);
		 System.out.println(list1);
		 System.out.println(list2);
		 
		list1.clear();
		System.out.println(list1);
		
		
	}

}
