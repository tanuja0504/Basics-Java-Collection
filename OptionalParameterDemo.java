package Java8;

import java.io.Console;
import java.util.Optional;

public class OptionalParameterDemo {

	public void add(Optional<Integer> a, Optional<Integer> b){
		int x = a.orElse(10);
		int y = b.orElse(20);
		System.out.println(x+y);
		System.out.println(b.isPresent());
	}
	public static void main(String[] args) {
		OptionalParameterDemo obj = new OptionalParameterDemo(); 
		
		Integer val1 = null;
		Optional<Integer> value1 = Optional.ofNullable(val1);
		Optional<Integer> value2 = Optional.ofNullable(99);
		obj.add(value1,value2);

	}

}
