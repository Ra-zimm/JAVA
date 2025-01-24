package DSA;

public class Test2 {

	public static void main(String[] args) {
		  Linked_List a=new Linked_List();
		  a.add(10);
		  a.add(20);
		  a.add(30);
		  a.add(40);
		  a.add(50);
		  a.display();
		  Linked_List<String> a1=new Linked_List <String>();
		  a1.add("Razim");
		  a1.add("200");
		  a1.add("kooi");
		  a1.display();
		  Linked_List<Integer> a2=new Linked_List<Integer>();
		  a2.add(10);
		  a2.add(200);
		  a2.add(100);
		  System.out.println(a2.get(0)+10);
	}

}
