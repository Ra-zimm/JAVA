package colletionFrameWork;
import java.util.*;
public class TestMap {

	public static void main(String[] args) {
		 Map<Integer,String> a=new HashMap<Integer,String>();
		 a.put(104,"koi");
		 a.put(101,"razim");
		 a.put(102,"muzaib");
		 a.put(103,"sinaan");
		 a.put(105,"koooi");
		 System.out.println(a);
		 Map b=new HashMap();
		 b.put("kooi",1000);
		 b.put("poooi",4000);
		 a.putAll(b);
		 System.out.println(a);
		 System.out.println(a.get(101));
		 System.out.println(a.containsKey(104));
		 System.out.println(a.containsValue("sinaan"));
		 Set a1=a.keySet();
		 System.out.println(a1);
		 Collection a2=a.values();
		 System.out.println(a2);
		 Map m=new Hashtable();
			m.put(01,"a");
			m.put(02,"b");
			m.put(03,"c");
			m.put(04,"d");
			m.put(05,"e");
			System.out.println(m);
	}
	

}
 
