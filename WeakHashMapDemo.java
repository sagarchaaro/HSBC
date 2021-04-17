package misc.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws Exception{
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "sagar");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}

class Temp{
	public String toString(){
		return "temp";
	}
	public void finalize(){
		System.out.println("Called finalize method");
	}
}
