package colletionFrameWork;
import java.util.*;

public class Testset {

	public static void main(String[] args) {
		 Set a=new HashSet();//no specific order
		 a.add(10);
		 a.add(20);
		 a.add(80);
		 a.add(10);
		 System.out.println(a);
		 Set a1=new LinkedHashSet();
		 a1.add(90);
		 a1.add(80);
		 a1.add(80);
		 a1.add(70);
		 a1.add(70);
		 a1.add(1);
		 System.out.println(a1);
		 SortedSet s=new TreeSet();
		 s.add(	"aaa");
		 s.add( "bbbb");
		 s.add("cccc");
		 s.add("razim");
		 s.add("ddd");
	  System.out.println(s);
	  System.out.println(s.headSet("aaa"));
	  System.out.println(s.tailSet("razim"));
	 System.out.println(s.subSet("aaa","razim"));
		 
		 
		 

	}

}
