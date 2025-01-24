package colletionFrameWork;
import java.util.*;

public class TestListiterator {

	public static void main(String[] args) {
		 List l=new LinkedList();
		 l.add(80);
		 l.add(70);
		 l.add(60);
		 l.add(50);
		 l.add(40);
		 ListIterator itr = l.listIterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 System.out.println("____________");
		 while(itr.hasPrevious())
		 {
			 System.out.println(itr.previous());
		 }

	}

}
