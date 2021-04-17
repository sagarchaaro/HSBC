package misc.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap m= new LinkedHashMap();
		m.put("first", 2);
		m.put("second", 3);
		m.put("third", 5);
		m.put("fourth", 7);
		m.put("fifth", 11);
		m.put("sixth", 13);
		System.out.println(m);
	}
}
