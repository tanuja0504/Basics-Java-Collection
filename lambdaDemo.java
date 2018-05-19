package Java8;


public class lambdaDemo {
	final static String m = "Hello y";

	interface mathAdd{
	public int add(int a, int b);
}

	interface greeting{
		public void msg(String message);
	}
private int operate(int a,int b,mathAdd a1) {
	return a1.add(a, b);
}

public int find (int x){
	return x;
}
	public static void main(String[] args) {
		
		int a = 10;
		int b =101;
		mathAdd obj1 = (int x,int y) -> x+y;
		lambdaDemo obj = new lambdaDemo();
		System.out.println(obj.operate(a, b, obj1));
		
		greeting greet = message -> System.out.println(m+message);
		
		System.out.println(m);
		greet.msg("Tanuja");

	}

}
