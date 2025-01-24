package Deadlock_threading;

public class Stock {
	
	private int items;
	private static Stock st;
	private Stock( )
	{
		 
	}
	public static Stock getStock()
	{
		return st==null?st=new Stock():st;
	}
	public void availableStock()
	{
		System.out.println(items+" stocks available");
	}
	public synchronized void updateStock(int items)
	{
		this.items+=items;
		System.out.println("stocks updates to "+items);
		notify();
	}
	public synchronized void consumeStock(int items)
	{
		while(items>this.items)
		{
			System.out.println("stock not available waiting for update.....");
			try {wait();}catch(Exception e) {};
		}
		this.items-=items;
		System.out.println(items+" consumed");
	}

}
class UpdateThread implements Runnable
{
	int items;
	UpdateThread(int items)
	{
		this.items=items;
		new Thread(this).start();
	}
	public void run()
	{
		Stock.getStock().updateStock(items);
	}
}
class ConsumeThread implements Runnable
{
	int items;
	ConsumeThread(int items)
	{
		this.items=items;
		new Thread(this).start();
	}
	public void run()
	{
		Stock.getStock().consumeStock(items);
	}
}
