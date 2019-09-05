package com.bw.demo1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					"D://Person.txt"));

			ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
			System.out.println(list);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
