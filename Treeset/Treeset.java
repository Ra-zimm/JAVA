package Treeset;

public class Treeset {
     private Node root;
     private int count;
     private boolean flag=true;
     
     public boolean add(int key)
     {
    	root=addNode(key,root);
        return flag;
     }
     public Node addNode(int key,Node n)
     {
    	 if(n==null)
    	 {
    		 n=new Node(key);
    		 count++;
    		 return n;
    	 }
    	 if(key<n.key) n.left=addNode(key,n.left);
    	 else if(key>n.key) n.right=addNode(key,n.right);
    	 else flag=false;
    	 return n;
     }
     public void inOrder()
     {
    	 inOrder(root);
     }
     private void inOrder(Node n)
     {
    	 if(n==null)return;
    	 inOrder(n.left);
    	 System.out.println(n.key+" ");
         inOrder(n.right);
     }
     public int smallest()
     {
    	 Node n=getMinnode(root);
    	 return n.key;
     }
     public Node getMinnode(Node n)
     {
    	 if(n.left==null)return n;
    	 return getMinnode(n.left);
    	 
    	 
     }
     public void remove(int key)
     {
    	 root=removeNode(root,key);
     }
     Node removeNode(Node n,int key)
     {
    	 if(n==null)return n;
    	 if(key<n.key)n.left=removeNode(n.left,key);
    	 else if(key>n.key)n.right=removeNode(n.right,key);
    	 else {
    		 if(n.left==null&&n.right==null) n=null;
    		 else if(n.left==null) n=n.right;
    		 else  if(n.right==null)n=n.left;
    		 else
    		 {
    			 Node minnode=getMinnode(n.right);
    			 int temp=n.key;
    			 n.key=minnode.key;
    			 minnode.key=temp;
    			 n.right=removeNode(n.right,key);
    			 
    		 }
    	 }
    	 return n;
    	 
     }
}
