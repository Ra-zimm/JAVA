package Lmbdaexpression;
import java.util.*;
import java.util.function.*;


public class Perfectnum {

	public static void main(String[] args) {
	 Scanner A=new Scanner(System.in);
	 System.out.println("Entre a num");
	 int a=A.nextInt();
	 Predicate<Integer>p=i->a%i==0;
	 int sum=0;
	 for(int i=1;i<=a/2;i++)
	 {
		 if(p.test(i))
		 {
			 sum+=i;
		 }
	 }
	 Function<Integer,Boolean>fn=i->i==a;
	 Consumer<Integer>c=i->{
		 if(fn.apply(i)) System.out.println("peerfect number");
		 else System.out.println("not perfect number");
	 };
	 c.accept(sum);
	}
	 

}
