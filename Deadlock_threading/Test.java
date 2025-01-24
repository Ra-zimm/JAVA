package Deadlock_threading;

public class Test {

	public static void main(String[] args) {
		 Stock a=Stock.getStock();
		new UpdateThread(50);
		try {Thread.sleep(2000);}catch(Exception e) {e.printStackTrace();}
		new ConsumeThread(100);
		try {Thread.sleep(2000);}catch(Exception e) {e.printStackTrace();}
		new UpdateThread(150);
		try {Thread.sleep(2000);}catch(Exception e) {e.printStackTrace();}
		a.availableStock();
	}

}
