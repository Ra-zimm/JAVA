package DSA_STACK;

public class Test2 {

	public static void main(String[] args) {
		 Stack_linked a=new Stack_linked();
		 a.push(900);
		 a.push(800);
		 a.push(700);
		 a.push(600);
		 a.push(500);
		 a.push(400);
		 a.push(300);
		 a.push(200);
		 a.push(100);
		 a.show();
		 System.out.println(a.peak(3));
		 System.out.println(a.size());
		 System.out.println(a.pop());
		 System.out.println(a.size());
		 a.show();

	}

}
