package com.bw.demo2;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;
	private String sex;
	private int age;
	private String hobby;

	public Student(String name, String sex, int age, String hobby) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.hobby = hobby;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age
				+ ", hobby=" + hobby + "]";
	}

}
