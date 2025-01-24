package Threadingg;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("main starts");
		  new PrintnumThread();
		 
		 for(char i='A';i<='Z';i++)
		 {
			 System.out.println(i);
			 try {Thread.sleep(500);}catch(Exception e) {}
		 }
		 System.out.println("main ends");

	}

}
class PrintnumThread extends Thread
{
	PrintnumThread()
	{
		start();
	}
	@Override
	public void run()
	{
		System.out.println("printnum starts");
		for(int i=0;i<=20;i++)
		{
			System.out.println	(i);
			
			try {Thread.sleep(500);}catch(Exception e) {}
	     }
		System.out.println("print num ends");
		
	}
}
