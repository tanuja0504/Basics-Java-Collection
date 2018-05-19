package Java8;

interface Person{
	default void say(){
		System.out.println("I am a Person");
	}
}

interface Employee{
	default void say(){
		System.out.println("I am a Employee");
	}
}

class SoftwareDeveloper implements Person,Employee{
	
	public void say(){
		Person.super.say();
		Employee.super.say();
		System.out.println("I am a Software Developer with low salary");
	}
}

public class DefaultMethodDemo {

	public static void main(String[] args) {
		Employee e = new SoftwareDeveloper();
		e.say();
	}

}
