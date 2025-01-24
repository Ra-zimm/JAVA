package colletionFrameWork;

public class Treeset {
	Node root;
	int count;
	boolean flag=true;
	public boolean add(int key)
	{
		root=addNode(root,key);
		return flag;
	}
	private Node addNode(Node n,int key)
	{
		if(n==null)
		{
			n=new Node(key);
			count++;
			return n;
		}
		if(key<n.key)n.left=addNode(n.left,key);
		else if(key>n.key)n.right=addNode(n.right,key);
		else flag=false;
		return n;
	}
	public void inOrder()
	{
		inOrder(root);
	}
	public void inOrder(Node n)
	{
		if(n==null)return;
		inOrder(n.left);
		System.out.println(n.key);
		inOrder(n.right);
	}

}
