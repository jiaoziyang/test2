package com.bw.demo1;

import com.bw.demo1.Person;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {

		try {
			
			Person p1 = new Person("javaB005", "周杰伦", 62, "没及格");
			Person p2 = new Person("javaC001", "张三", 97, "");
			Person p3 = new Person("javaD002", "刘德华", 98, "");
			Person p4 = new Person("javaF003", "陈乐基", 90, "");

			ArrayList<Person> list = new ArrayList<Person>();
			
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
			
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("D://Person.txt"));

			oos.writeObject(list); 

			oos.flush();
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
