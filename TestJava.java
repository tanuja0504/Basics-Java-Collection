package Java8;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class TestJava extends Exception{
	
	public void dummy() throws FileNotFoundException{
		try{
			throw new ArrayIndexOutOfBoundsException("Hello");
		}
		finally{
			System.out.println("Ok");
		}
	}

		   public static void main(String args[]) { 
		      try {
		         throw new TestJava();
		      }
		      catch(TestJava t) {
		         System.out.println("Got the Test Exception");
		      }
		      finally {
		         System.out.println("Inside finally block ");
		      }
		  
}
}
