package misc.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
	
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object arg1, Object arg2) {
		Integer I1 = (Integer)arg1;
		Integer I2 = (Integer)arg2;
		
		if(I1<I2){
			return +1;
		}else if(I1>I2){
			return -1;
		}else{
			return 0;
		}
		
	}
	
}
