package day.eight.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIntroduction {
	
	public static void main(String[] args) {
		
		//Name of class <K, V> name of map = new name of the map<K,V>();
			HashMap<Integer, String> hmap = new HashMap<>();
			hmap.put(100, "Java");
			hmap.put(200, "c#");
			hmap.put(300,"Phython");
			
			System.out.println(hmap);
			
		    for (Map.Entry me: hmap.entrySet()) {
		    	System.out.println("Key: " + me.getKey()  + " values: " + me.getValue());
		    }
		    
		    Iterator it = hmap.entrySet().iterator();
		    while(it.hasNext()) {
		    	Map.Entry me = (Map.Entry) it.next();
		    	System.out.println("Key: " + me.getKey()  + " values: " + me.getValue());
		    }
		
	}

}
