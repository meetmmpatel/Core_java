package day.eight.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExmaple {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
		
		ArrayList<Integer>list2 = new ArrayList<>();
		
		
		list.add("Steve");
		list.add("Tim");
		list.add("Pat");
		list.add("Steve");
		list.add("Tim");
		list.add("Pat");
		list.add("Steve");
		list.add("Tim");
		list.add("Pat");

		list1.add("Angela");
		list1.add("Tom");
		list1.add("Angela");
		list1.add("Tom");
		list1.add("Angela");
		list1.add("Tom");

		System.out.println(list.size());
		System.out.println(list.remove("Steve"));
	

		System.out.println(list);
		System.out.println(list1);

		for (String st : list) {
			System.out.println(st);

		}
		
		System.out.println(list.size());
		list.add(12, "this is new elements");
		System.out.println(list);
				
		

	}

}
