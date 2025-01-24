package DSA;

public class TEST1 {

	public static void main(String[] args) {
		 Array_List l=new Array_List();
		 l.add(90);
		 l.add("razim");
		 l.add("kooi");
		 l.set(2,"keerthan");
		System.out.println( l.size());
		l.show();
         l.remove(0);
         System.out.println( l.size());
         l.show();
         l.add(10);
         System.out.println(((Integer)l.get(3))+20);
	}

}
