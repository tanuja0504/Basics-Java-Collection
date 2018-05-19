package Java8;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MethodReference {

	public static void find(int x){
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		  names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
	      
	      names.forEach(System.out::println);
	      int x=10;
//	      MethodReference obj2 = MethodReference::find;
	      System.out.println();
	}

}
