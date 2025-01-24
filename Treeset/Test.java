package Treeset;

public class Test {

	public static void main(String[] args) {
		 Treeset a=new Treeset();
		 a.add(10);
		 a.add(100);
		 a.add(5);
		 a.add(210);
		 a.add(300);
		 a.add(800);
		 a.add(10);
		 a.inOrder();
		 a.remove(10);
		 a.inOrder();

	}

}
