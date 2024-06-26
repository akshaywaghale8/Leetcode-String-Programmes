package com.akshu.LogicalAssignments;

import java.util.Scanner;

class Course {
	private int coursecode;
	private String courseName;
	private String department = "";
	private int credits;

	Scanner sc = new Scanner(System.in);

	public Course(int coursecode, String courseName) {
		super();
		this.coursecode = coursecode;
		this.courseName = courseName;
	}

	public Course(int coursecode, String courseName, String department) {
		super();
		this.coursecode = coursecode;
		this.courseName = courseName;
		this.department = department;
	}

	public void displayCreadit() {
		if (department.equalsIgnoreCase("")) {
			setDepartment();
		}
		if (getCredits() == 0) {
			setCredits();
		}
		System.out.println(department + " credits are " + credits);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment() {
		System.out.println("Enter department name : ");
		this.department = sc.next();

	}

	public int getCredits() {
		return credits;
	}

	public void setCredits() {
		System.out.println("Enter " + department + " Credits [1-10] : ");
		this.credits = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Course Details \n coursecode=" + coursecode + ", courseName=" + courseName + ", \n department="
				+ department + ", credits=" + credits + "\n \n";
	}
}

public class DisplayCredits {
	public static void main(String[] args) {
		Course c1 = new Course(111, "B.Tech", "Computer");
		Course c2 = new Course(222, "B.Sc");

		c1.displayCreadit();
		c2.displayCreadit();
	}
}
