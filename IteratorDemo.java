package misc.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		for(int i=0;i<=10;i++){
			al.add(i);
		}
		System.out.println(al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			
			Integer n=(Integer)itr.next();
			
			if(n%2==0){
				System.out.println(n);
			}else{
				itr.remove();
			}
		}
		System.out.println(al);
	}
}
