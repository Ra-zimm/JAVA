package DSA_Queue;

public class Test2 {

	public static void main(String[] args) {
		 Queue_linked a=new Queue_linked();
		 a.add(100);
		 a.add(200);
		 a.add(300);
		 a.add(400);
		 a.add(500);
		 a.add(600);
		  a.add(700);
		  a.show();
		  System.out.println(a.size());
		  System.out.println(a.poll());
		  a.show();
		  System.out.println(a.size());
		  System.out.println(a.poll());
		  a.show();
		  System.out.println(a.peak(0));
		  System.out.println(a.size());
		  Queue_linked b=new Queue_linked();
		  b.poll();
	}

}
