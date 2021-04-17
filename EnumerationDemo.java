package misc.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v= new Vector<Integer>();
		for(int i=0;i<=10;i++){
			v.addElement(i);
		}
		
		System.out.println(v);
		
		System.out.println(v.elementAt(4));
		System.out.println("Data from the vector collection is :");
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			Object s=e.nextElement();
			System.out.println(s.toString());
		}
	}
}
