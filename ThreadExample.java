package Java8;

public class ThreadExample extends Thread{
	public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                  Thread.currentThread().getId() +
                  " is running");
 
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
	public static void main(String[] args) throws InterruptedException {int n = 8; // Number of threads
   
	for (int i=0; i<8; i++)
    {
        ThreadExample object = new ThreadExample();
        object.run();
        
    }// TODO Auto-generated method stub

	}

}
