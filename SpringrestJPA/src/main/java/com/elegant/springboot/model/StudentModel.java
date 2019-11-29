package com.elegant.springboot.model;

public class StudentModel {

	public StudentModel() {
		super();
	}

	public StudentModel(int rollNum, String name, int marks, String course) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	private int rollNum;
	private String name;
	private int marks;
	private String course;

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentModel [rollNum=" + rollNum + ", name=" + name + ", marks=" + marks + ", course=" + course
				+ ", getRollNum()=" + getRollNum() + ", getName()=" + getName() + ", getMarks()=" + getMarks()
				+ ", getCourse()=" + getCourse() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
