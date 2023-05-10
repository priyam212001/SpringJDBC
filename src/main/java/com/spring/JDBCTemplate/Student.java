package com.spring.JDBCTemplate;

public class Student {

	private int id,mark;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name,int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	
	public Student() {
		
	}
}
