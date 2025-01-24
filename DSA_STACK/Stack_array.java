package DSA_STACK;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack_array {
     private Object[]a;
     private int pos;
	public Stack_array() {
		 a=new Object[6];
		 pos=0;
	}
	public void push(Object o)
	{

		if(pos>=a.length)increase();
		 for(int i=size()-1;i>=0;i--)
		 {
			 a[i+1]=a[i];
		 }
		 a[0]=o;
		 pos++;
	}
	private void increase()
	{
		Object[]temp=new Object[a.length+4];
		System.arraycopy(a,0,temp,0,a.length);
		a=temp;
	}
	public int size()
	{
		return pos;
	}
	public Object pop()
	{
		if(size()==0) new EmptyStackException();
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
		if(size()==0) new EmptyStackException();
		if(index<0||index>=size()) new IndexOutOfBoundsException();
		return a[index];
	}
	public void show()
	{
		System.out.println(Arrays.toString(a));
	}
	

}
