package misc.map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Object, Object> m1 = new HashMap<Object, Object>();
		Object first=m1.put(101, "sagar");
		System.out.println(first);//returns the null value
		
		m1.put(102, "Ravi");
		m1.put(103, "kiran");
		Object second=m1.put(101, "sachin");
		System.out.println("Returned value for existing key is :"+second);
		System.out.println(m1);
		
		HashMap<String, Integer> m2= new HashMap<>();
		m2.put("first", 2);
		m2.put("second", 3);
		m2.put("Third", 5);
		m2.put("fourth", 7);
		m2.put("fifth", 11);
		m2.put("sixth", 13);
		
		m1.putAll(m2);
		System.out.println("After addind the another Map :"+m1);
		
		Object third=m1.get("Third");
		System.out.println("Returned vale from get method :"+third);
		
		Object fourth=m1.get(13);
		System.out.println("Return type of 13 key is :"+fourth);
		
		//Object fifth=m1.remove("fifth");
		//System.out.println("Removed return type is :"+fifth);
		
		System.out.println("After Reoving the Data from Map "+m1);
		
		boolean sixth=m1.containsKey("second");
		System.out.println("ContainsKey method return is :"+sixth);
		
		boolean seventh = m1.containsValue(11);
		System.out.println("ContainsValue method return type is :"+seventh);
		
		
		//m1.clear();
		//System.out.println(m1);
		
		boolean eigth= m1.isEmpty();
		System.out.println("Empty Map or Not? :"+eigth);
		
		int size=m1.size();
		System.out.println("Size of the Map Interface is :"+size);
		
		
		Set nine=m1.keySet();
		System.out.println("Set of Keys is :"+nine);
		
		Iterator<Object> itr= nine.iterator();
		System.out.println("Printing the Set of Keys is ");
		
		while(itr.hasNext()){
			Object data_set=itr.next();
			System.out.println(data_set);
			if(data_set.toString().equals("Third")){
				itr.remove();
			}
		}
		System.out.println("Set of Keys after removing the data is :"+nine);
		
		Collection<Object> tenth=m1.values();
		System.out.println(tenth);
		
		Set eleven=m1.entrySet();
		Iterator itr1= eleven.iterator();
		while(itr1.hasNext()){
			Map.Entry s=(Map.Entry)itr1.next();
			System.out.println(s.getKey()+".........."+s.getValue());
			if(s.getKey().equals(102)){
				itr1.remove();
			}
		}
		
		System.out.println(eleven);
		System.out.println(m1);
		
		while(m1.entrySet().iterator().hasNext()){
			Map.Entry s=(Map.Entry)itr1.next();
			System.out.println(s.getKey()+".........."+s.getValue());
			if(s.getKey().equals("sixth")){
				itr1.remove();
			}
		}
		
		
		
		
		
		
		
		
	}
}
