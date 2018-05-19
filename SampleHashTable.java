package basicJavaCollectionMAP;

import java.util.HashSet;
import java.util.Iterator;

public class SampleHashTable {

	public static void main(String[] args) {
		HashSet hset = new HashSet();
		hset.add(5);
		hset.add(10);
		
		Iterator it = hset.iterator();
		while(it.hasNext()){
			System.out.println(it.hashCode());
			it.next();
		}

	}

}
