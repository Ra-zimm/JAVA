package DSA_STACK;

import java.util.EmptyStackException;

public class Stack_linked {
       private Node first;
       private int count;
       
       public void push(Object o)
       {
    	   if(first==null)
    	   {
    		   first =new Node(o);
    		   count++;
    		   return;
    	   }
    	   first=new Node(o,first);
    	   count++;
       }
       public int size()
       {
    	   return count;
       }
       public Object pop()
       {
    	   if(size()==0) new EmptyStackException();
    	   Object temp=first.ele;
    	   first=first.next;
    	   count--;
    	   return temp;
       }
       public Object peak(int index)
       {
    	   if(size()==0) new EmptyStackException();
    	   if(index<0||index>=size()) new IndexOutOfBoundsException();
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
