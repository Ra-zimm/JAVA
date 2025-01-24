package DSA;

public class Linked_List <E>{
	private Node first;
	private int count;
	public void add(E o)
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
	
	
	public void add(E o,int index)
	{
		if(index<0||index>=size()) throw new IndexOutOfBoundsException();
		if(index==0)
		{
			first=new Node(o,first);
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=new Node(o,curr.next);
		count++;
	}
	
	
	public int size()
	{
		return count;
	}
	public E get(int index)
	{
		if(index<0||index>=size()) throw new IndexOutOfBoundsException();
		if(index==0)
		{
			return (E)first.ele;
		}
		Node curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return (E)curr.ele;
	}
	
	
	public void remove(int index)
	{
		if(index<0||index>=size()) throw new IndexOutOfBoundsException();
		if(index==0)
			{
			first=first.next;
			count--;
			return;
			}
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	public void rev()
	{
		Node prev=null;
		Node curr=first;
		Node next;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
	public void display()
	{
		Node curr=first;
		while(curr!=null)
		{
			System.out.print(curr.ele+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
 	
}
