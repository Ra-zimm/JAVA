package DSA_STACK;

public class Node {
       Object ele;
       Node next;
	public Node(Object o) {
		 ele=o;
		 next=null;
	}
	public Node(Object o,Node n) {
		 ele=o;
		 next=n;
	}

}
