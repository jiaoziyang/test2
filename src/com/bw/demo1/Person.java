package com.bw.demo1;

import java.io.Serializable;

public class Person implements Serializable {

	private String id;
	private String name;
	private int score;
	private String condition;

	public Person(String id, String name, int score, String condition) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.condition = condition;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", score=" + score
				+ ", condition=" + condition + "]";
	}

}
