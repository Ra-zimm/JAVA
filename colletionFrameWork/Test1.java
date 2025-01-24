package colletionFrameWork;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test1 {

	public static void main(String[] args) {
		  List a=new LinkedList();
		 a.add(20);
		 a.add(30);
		 a.add(50);
		 a.add(80);
		 a.add(90);
		 System.out.println(a);
		 Collections.sort(a);
		 System.out.println(a);
		 List<Student>s=new LinkedList<Student>();
		 s.add(new Student("f",30));
		 s.add(new Student("a",23));
		 s.add(new Student("e",40));
		 s.add(new Student("c",35));
		 s.add(new Student("d",15));
		 s.add(new Student("b",90));
		 System.out.println(s);
		 Collections.sort(s,new Student());
		 System.out.println(s);
	}

}
class Student implements Comparator<Student>
{
	String name;
	int mark;
	Student(String n,int m)
	{
		name=n;
		mark=m;
	}
	Student()
	{
		
	}
	public int compare(Student s1,Student s2)
	{
		return  s2.mark-s1.mark;
	}
	public String toString()
	{
		return " name="+name+" mark="+mark;
	}
}
