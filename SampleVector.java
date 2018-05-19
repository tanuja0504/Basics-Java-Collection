package basicJavaCollectionLIST;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;

public class SampleVector {

	public static void main(String[] args) {
		Vector<String> vList = new Vector<String>();
		
		for(int i=0;i<12;i=i+2)
		vList.add("FRUIT"+i);
		
	//	System.out.println(vList);
		
		Enumeration en = vList.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}

}
