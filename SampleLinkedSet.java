package basicJavaCollectionSET;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class SampleLinkedSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lset = new LinkedHashSet<String>();				
		  lset.add("Apple");
	      lset.add("Mango");
	      lset.add("Grapes");
	      lset.add("Orange");
	      lset.add("Fig");
	      lset.add("");
	      lset.add("");//HashSet will replace if value already exists
		Iterator<String> it = lset.iterator();
		   
		while(it.hasNext()){
			System.out.println(it.next());
		}				
		System.out.println(lset.size());
	}

}
