package dayTwo.Expression;

import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		
		treeSetExample();
		String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
		String p2 = "==========================================";
		for (int i = 0; i < 4; i++) {
			System.out.println(p1);
		}
		System.out.println("* * * * * * ==================================");
		for (int i = 0; i < 6; i++) {
			System.out.println(p2);
		}
		
		
	}

	public static void treeSetExample() {
		TreeMap <Integer,String> tree_map1 = new TreeMap<>();
		tree_map1.put(21, "Black");
		tree_map1.put(24, "Black");
		
		System.out.println(tree_map1.higherEntry(20));
		
		
		
	}
	
}
