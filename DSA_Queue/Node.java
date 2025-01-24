package DSA_Queue;

public class Node {
     Object ele;
     Node next;
     
     public Node(Object e)
     {
    	 ele=e;
    	 next=null;
     }
     public Node(Object e,Node n)
     {
    	 ele=e;
    	 next=n;
     }
}
