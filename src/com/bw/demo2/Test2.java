package com.bw.demo2;

import java.io.File;
import java.io.FileInputStream; 
import java.io.ObjectInputStream;

public class Test2 {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\Student.txt")));
			
			Object readObject = ois.readObject();
			
			System.out.println(readObject);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
