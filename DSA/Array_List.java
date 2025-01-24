package DSA;

import java.util.Arrays;

public class Array_List {
        private Object[]a;
         private int pos;
	public Array_List() {
		 a=new Object[5];
		 pos=0;
	}
	public void add(Object o)
	{
		if(pos>=a.length) increase();
		a[pos++]=o;
	}
	private void increase()
	{
		Object[]temp=new Object[a.length+3];
		System.arraycopy(a,0,temp,0,a.length);
		a=temp;
	}
	public int size()
	{
		return pos;
	}
	public Object get(int index)
	{
		if(index<0||index>=size()) throw new IndexOutOfBoundsException();
		return a[index];
	 
	}
	 public void remove(int index)
	 {
		 if(index<0||index>=size()) throw new IndexOutOfBoundsException();
		 for(int i=index+1;i<size();i++)
		 {
			 a[i-1]=a[i];
		 }
		 pos--;
		 a[pos]=null;
	 }
	 public void set(int index,Object o)
	 {
		 if(index<0||index>=size()) throw new IndexOutOfBoundsException();
		 if(pos>=a.length)increase();
		 for(int i=size()-1;i>=index;i--)
		 {
			 a[i+1]=a[i];
		 }
		 pos++;
		 a[index]=o;
	 }
	 public void show()
	 {
		 System.out.println(Arrays.toString(a));
	 }
	 
	

}
