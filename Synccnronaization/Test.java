package Synccnronaization;

public class Test {

	public static void main(String[] args) {
		 Account a=new Account();
		 new DepositThread(a,1000);
		 new DepositThread(a,1000);
		 try { Thread.sleep(300);}catch(Exception c) {};
		 a.checkBalance();
}
}
class DepositThread implements Runnable
{
	Account acc;
	int amnt;
	DepositThread(Account a,int n)
	{
		acc=a;
		amnt=n;
		new Thread(this).start();
	}
	public void run()
	{
		acc.deposit(amnt);
	}
}
