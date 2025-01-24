package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test1 {

	public static void main(String[] args) throws Exception {
		 File file=new File("D:\\Filehandling\\test2.txt");
		 file.createNewFile();
		 FileOutputStream f=new FileOutputStream(file);
		 String a="koooii bye bye";
		 byte[]b=a.getBytes();
		 
		 if(file.canWrite())
		 {
			 f.write(b);
		 }
		 
		 FileInputStream fl=new FileInputStream(file);
		if(file.canRead())
		{
			int n=fl.read();
			while(n!=-1)
			{
				System.out.print((char)n);
				n=fl.read();
			}
		}
		fl.close();
		 

	}

}
