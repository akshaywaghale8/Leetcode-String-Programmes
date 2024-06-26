package com.akshu.LogicalAssignments;

import java.util.Arrays;
import java.util.Scanner;

class StudentP4
{
	private String name;
	private int rollNumber ;
	private String department = "Unknown";
	private int semester = 1;
	
	private double[] sgpas = new double[semester];
	private double gpa ;
	
	Scanner sc = new Scanner(System.in);

	public StudentP4(String name, int rollNumber) 
	{
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public StudentP4(String name, int rollNumber, String department)
	{
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.department = department;
	}

	public int getSemester() 
	{
		return semester;
	}

	public void setSemester() 
	{
		System.out.println(name +" enter your current Semester number [1-8] : ");
		semester = sc.nextInt();
		if(semester != 1 )sgpas = new double[semester - 1];
	}
	
	public void setCGPA()
	{
		if(getSemester() == 1) 
		{
			setSemester();
		}
		
		for(int i = 0; i < sgpas.length ; i++)
		{
			System.out.print("Enter "+(i+1)+" semester sgpa :");
			sgpas[i] = sc.nextDouble();
		}
	}
	
	public void calculateGPA()
	{
		if(semester == 1)
		{
			setCGPA();
		}
		double sum = 0;
		for(double sgpa : sgpas )
		{
			sum += sgpa;
		}
			
		gpa = sum / sgpas.length;
		System.out.println(name+" your current GPA is "+gpa);
	}

	@Override
	public String toString() {
		return "Student Details :\n name=" + name + ", rollNumber=" + rollNumber + ", \n department=" + department + ", semester="
				+ semester + ", \n sgpas=" + Arrays.toString(sgpas) + ", gpa=" + gpa + "\n \n";
	}
	
}
public class CgpaCalculater
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		StudentP4 s1  = new StudentP4("Akshay", 111, "Computer");
		StudentP4 s2 = new StudentP4("karan", 201);
		
		s1.setCGPA();
		
		s2.calculateGPA();
		
		s1.calculateGPA();
		
		System.out.println(s1);
		System.out.println(s2);
		 
	}

}
