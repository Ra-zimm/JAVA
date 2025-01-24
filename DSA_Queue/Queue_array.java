package DSA_Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Queue_array {
	private Object[]a;
	private int pos;
	public Queue_array()
	{
		a=new Object[6];
		pos=0;
	}
	public void add(Object o)
	{
		if(pos>=a.length)increase();
		a[pos++]=o;
	}
	private void increase()
	{
		Object[]temp=new Object[a.length+4];
		System.arraycopy(a,0, temp,0,a.length);
		a=temp;
	}
	public int size()
	{
		return pos;
	}
	public Object poll()
	{
		if(pos==0) throw new NoSuchElementException();
		Object temp=a[0];
		for(int i=1;i<size();i++)
		{
			a[i-1]=a[i];
		}
		pos--;
		a[pos]=null;
		return temp;
	}
	public Object peak(int index)
	{
		if(pos==0) throw new NoSuchElementException();
		if(index<0||index>=size()) throw new IndexOutOfBoundsException();
		return a[index];
		
	}
	public String show()
	{
		return Arrays.toString(a);
	}

}
