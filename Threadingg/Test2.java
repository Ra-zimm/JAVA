package Threadingg;

public class Test2 {

	public static void main(String[] args) {
		 new Thread(new A()).start();
		
	}

}
class A implements Runnable
{
	public void run()
	{
		for(char i='A';i<='Z';i++)
		{
			System.out.println(i);
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
