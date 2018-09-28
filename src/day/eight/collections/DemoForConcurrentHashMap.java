package day.eight.collections;

import java.util.concurrent.ConcurrentHashMap;

public class DemoForConcurrentHashMap {
	public static void main(String[] args) {
		
		ConcurrentHashMap map = new ConcurrentHashMap<>();
		map.put(200, 400);
		map.put(300, 400);
		map.put(600, 400);
		map.put(700, 400);
		
		map.putIfAbsent(800, 600);
		map.putIfAbsent(800, 600);
		System.out.println(map);
		
		map.replace(600, 400, 500);
		System.out.println(map);
	}

}
