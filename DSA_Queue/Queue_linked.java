package DSA_Queue;

import java.util.NoSuchElementException;

public class Queue_linked {
	private Node first;
	private int count;
	
	public void add(Object o)
	{
		if(first==null)
		{
			first=new Node(o);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(o);
		count++;
	}
	public int size()
	{
		return count;
	}
	public Object poll()
	{
		if(count==0) throw new NoSuchElementException();
		Object temp=first.ele;
		first=first.next;
		count--;
		return temp;
	}
	public Object peak(int index)
	{
		if(count==0) throw new NoSuchElementException();
		if(index<0||index>=size()) throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	public void show()
	{
		Node curr=first;
		 for(int i=1;i<=size();i++)
		 {
			 System.out.print(curr.ele+" ");
			 curr=curr.next;
		 }
		 System.out.println();
	}

}
