package basicJavaCollectionLIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SampleArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		for(int i=0;i<3;i++)
		{
			for(int j=3;j>i;j--)
			alist.add(i,i+j);
			
		}
		System.out.println("ArrayList Size"+alist.size());
		
		System.out.println("Iterator to Print");
		Iterator<Integer> it = alist.iterator();		
		while(it.hasNext()){
			System.out.println(it.next());
	
		}
		
		System.out.println("Removing element at 1 index "+alist.remove(1));		
		System.out.println("For-Each Loop");
		for(int i : alist){
			System.out.println(i);
		}
		
		System.out.println("ArrayList contains 4 "+alist.contains(4)+" at " +alist.indexOf(4));
		Collections.sort(alist);
		System.out.println("SortedList Array"+alist);
			
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println("Sorted ArrayList"+alist);
	}

}
