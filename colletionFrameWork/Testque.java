package colletionFrameWork;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Testque {

	public static void main(String[] args) {
		 Queue a1=new LinkedList();//queue using linked list
		 Queue a2=new ArrayDeque();//queue using Array
		 Queue a3=new PriorityQueue(new Des());
		  a1.add(10);
		  a1.add(80);
		  a1.add(90);
		  display(a1);
		  a2.add(90);
		  a2.add(90);
		  a2.add(100);
		  display(a2);
		  a3.add(80);
		  a3.add(70);
		  a3.add(10);
		  a3.add(10000);
		  display(a3);
	}
	static void display(Queue a)
	{
		 while(!a.isEmpty())
		 {
			 System.out.print(a.poll()+" ");
		 }
		 System.out.println();
	}
    
}
class Des implements Comparator 
{
	public int compare(Object a,Object b)
	{
		 int i=(Integer)a;
		 int j=(Integer)b;
		 return j-i;
	}
}
