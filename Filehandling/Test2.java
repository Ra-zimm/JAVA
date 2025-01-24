package Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	public static void main(String[] args)throws Exception {
		 FileReader file=new FileReader("D:\\Filehandling\\test2.txt");
		 BufferedReader bf=new BufferedReader(file);
		 String s=bf.readLine();
		 while(s!=null)
		 {
			Matcher m= Pattern.compile("[9876][0-9]{9}").matcher(s);
			if(m.find())
			{
				System.out.println(m.group());
			}
			s=bf.readLine();
		 }
		 

	}

}
