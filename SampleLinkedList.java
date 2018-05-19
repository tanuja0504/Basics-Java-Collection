package basicJavaCollectionLIST;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class SampleLinkedList {

	public static void main(String[] args) {
		LinkedList<String> alist = new LinkedList<String>();
		
		alist.add("GM");
		alist.add("Audi");
		alist.add("BMW");
		alist.add("Honda");
		alist.add("Nissan");
		alist.add("Toyota");
		
		System.out.println("LinkedList Size "+alist.size());
		
		System.out.println("Iterator to Print");
		Iterator<String> it = alist.iterator();		
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str+" at "+alist.indexOf(str));	
		}
		
		System.out.println("Removing first element "+alist.removeFirst());	
		System.out.println("Set first element "+alist.set(1, "Fiat"));	
		
		System.out.println("Removing element at 3 index "+alist.remove(3));		
		System.out.println("For-Each Loop");
		for(String str : alist){
			System.out.println(str+" at "+alist.indexOf(str));
		}
		System.out.println("LinkedList first element "+alist.poll());
		
		System.out.println("Adding element "+alist.add("GM"));
		Collections.sort(alist);
		System.out.println("Sorted LinkedList"+alist);
			
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println("Sorted LinkedList in Reverse Order "+alist);
		
		
	}

}
