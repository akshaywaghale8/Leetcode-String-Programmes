package com.akshu.LogicalAssignments;

class Student 
{
	private int studentId ;
	private String studentName;
	
	public Student(int studentId)
	{
		this.studentId = studentId;
		this.studentName = "Unknown";
	}

	public Student(int studentId, String studentName) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String getStudentName() 
	{
		return studentName;
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
}

 public class StudentTest
 {
	 public static void main(String[] args) 
	 {
		Student s1 = new Student(111,"Akshay");
		
		Student s2 = new Student(222);
		
		System.out.println(s1);
		System.out.println(s2);
		
	 }
 }
 
 
 
 
 
 
 
 
 