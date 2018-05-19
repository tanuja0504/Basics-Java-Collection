package basicJavaCollectionSET;

import java.util.HashSet;
import java.util.Iterator;

public class SampleHashSet {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();				
		  hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      hset.add("");
	      hset.add("");//HashSet will replace if value already exists
		Iterator<String> it = hset.iterator();
		   
		while(it.hasNext()){
			System.out.println(it.next());
		}				
		System.out.println(hset.size());
	}

}
