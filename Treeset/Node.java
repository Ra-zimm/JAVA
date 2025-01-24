package Treeset;

public class Node {
	int key;
	Node left;
	Node right;

	public Node(int ele) {
		this.key=ele;
		 
	}
	public Node(int ele,Node left,Node right)
	{
		this.key=ele;
		this.left=left;
		this.right=right;
	}
	

}
