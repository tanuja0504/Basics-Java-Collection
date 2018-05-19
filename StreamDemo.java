package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(1);
		list.add(1111);
		list.add(11111);
		
		list.stream().sorted().limit(2).forEach(System.out::println);
		
	//	List<Integer> list1 = list.stream().map(j -> j*j*10).distinct().collect(Collectors.toList());
		
		//list1.forEach(System.out::println);
		
		
		
	}

}
