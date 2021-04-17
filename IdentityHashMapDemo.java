package misc.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap m = new IdentityHashMap();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		m.put(I1, "sagar");
		m.put(I2, "ch");
		
		System.out.println(m);
		System.out.println(I1==I2);
		System.out.println(I1.equals(I2));
		
		HashMap m1 = new HashMap();
		Integer I3 = new Integer(10);
		Integer I4 = new Integer(10);
		m1.put(I3, "sagar");
		m1.put(I4, "ch");
		
		System.out.println(m1);
		System.out.println(I3==I4);
		System.out.println(I3.equals(I4));
	}
}
