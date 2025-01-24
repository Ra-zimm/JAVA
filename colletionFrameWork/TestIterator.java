package colletionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		 Collection a=new ArrayList();
		    a.add(10);
		    a.add("razim");
		    a.add("9000");
		    a.add(20);
		    Iterator itr=a.iterator();
		    while(itr.hasNext())
		    {
		    	System.out.println(itr.next());
		    	
		    }
		    Collection<Integer>a1=new ArrayList<Integer>();
		    a1.add(1);
		    a1.add(2);
		    a1.add(3);
		    a1.add(4);
		    a1.add(5);
		    a1.add(6);
		    Iterator itrr=a1.iterator();
		    while(itrr.hasNext())
		    {
		    	int i=(Integer)itrr.next();
		    	if(i%2==0)itrr.remove();
		    }
		    System.out.println(a1);
	}

}
