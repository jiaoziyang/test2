package com.bw.demo2;
 
import java.io.FileOutputStream; 
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		Student s1 = new Student("½¹×ÓÑï", "ÄÐ", 18, "123");
		Student s2 = new Student("±åÏþ½¨", "ÄÐ", 14, "456");
		Student s3 = new Student("ºÎÇ¿", "ÄÐ", 16, "567");
		Student s4 = new Student("ÊºÇ¿", "ÄÐ", 18, "678");
		Student s5 = new Student("ºÎÊº", "ÄÐ", 20, "789");
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Student.txt"));
			
			oos.writeObject(list);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
