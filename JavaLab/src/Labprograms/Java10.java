package Labprograms;

class Thread11 implements Runnable{
	
	Thread t;
	Thread11()
	{
		t = new Thread(this,"Demo thread");
		System.out.println("Child thread");
		t.start();
	}
	public void run()
	{
		try {
			for(int i=5 ; i>=0 ; i--)
			{
				System.out.println("Child thread 2"+i*i*i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child thread interrupted");
		}
		System.out.println("Child thread got killed");
	}
}

class Thread10 extends Thread{
	
	Thread10()
	{
		super("Demo thread");
		System.out.println("Child thread");
		start();
	}
	public void run()
	{
		try {
			for(int i=5 ; i>=0 ; i--)
			{
				System.out.println("Child thread 1"+i*i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child thread interrupted");
		}
		System.out.println("Child thread got killed");
	}
}

public class Java10 {

	public static void main(String[] args) {
		
		new Thread10();
		new Thread11();
		try {
			for(int i=5 ; i>=0; i--)
			{
				System.out.println("Main thread "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
        System.out.println("Main thread killed");
        
	}

}
