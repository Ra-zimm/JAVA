package Synccnronaization;

public class Account {
    int bal=1000;
    
    synchronized void deposit(int amnt)
    {
    	this.bal+=amnt;
    	System.out.println(amnt+" deposited ");
    }
    synchronized void checkBalance()
    {
    	System.out.println(this.bal);
    }
}
