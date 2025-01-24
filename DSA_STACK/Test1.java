package DSA_STACK;

public class Test1 {

	public static void main(String[] args) {
		 Stack_array a=new Stack_array();
		 a.push(10);
		 a.push(20);
		 a.push(30);
		 a.push(40);
		 a.push(50);
		 a.push(60);
		 a.push(70);
         a.push(80);
         a.push(90);
         a.push(100);
		 a.show();
		 System.out.println(a.pop());
		 System.out.println(a.size());
		 a.show();
		 System.out.println(a.peak(0));
         System.out.println(a.size());
	}

}
