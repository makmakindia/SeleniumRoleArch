package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		
		//add values to list 
		list.add(10);
		list.add("New York");
		list.add(true);
		list.add(10.34);
		list.add("New York");
		list.add(null);
		list.add(1000);
		
		/// print elements in list 
//		System.out.println(list);
		
		//remove value from list 
		list.remove(4);
//		System.out.println(list);
//		System.out.println(list.size()); // return sze of list 
//		System.out.println(list.get(3)); // print value based on index
		
		//printing all values of list using for loop
//		for(int i=0;i<list.size();i++) {
//			
//			System.out.println(list.get(i));
//		}
		
		//print list values using exstended for loop
//		for(Object i: list )
//		{
//			System.out.println(i);
//		}
		
		// using iterator --> print list values 
		
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		

		
		// ArrayList generic 
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(2);
		l1.add(4);
		l1.add(6);
		l1.add(8);
		System.out.println(l1);
		
		
	}

}