package misc.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("Sagar");
		h.add(567);
		h.add("India");
		System.out.println(h.add("Sagar"));
		
		Iterator itr = h.iterator();
		System.out.println("HashSet Data is :");
		while(itr.hasNext()){
			String data=itr.next().toString();
			System.out.print(data+" ");
		}
		
		System.out.println(h.isEmpty());
		System.out.println(h.add("facebook"));
		
		ArrayList al= new ArrayList();
		al.add("ABCD");
		al.add(5698);
		al.add("ABCD");
		al.add("Test1234");
		System.out.println("ArrayList Data is :"+al);
		
		HashSet h1 = new HashSet(al);
		System.out.println("After Converting ArrayList into the HashSet is :"+h1);
		
		h.addAll(al);
		System.out.println("After Adding the HashSet with the ArrayList is :"+h);
		
		System.out.println(h.contains("xyz"));
		
		Object[] obj=h.toArray();
		System.out.println("After convering into the Array data is :");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
