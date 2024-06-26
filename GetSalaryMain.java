package com.akshu.LogicalAssignments;

import java.util.Scanner;

class Employee
{
	private String name ;
	private int employeeId ;
	private String designation;
	private double salary ;
	
	Scanner sc = new Scanner(System.in);
	
	public Employee(String name, int employeeId)
	{
		super();
		this.name = name;
		this.employeeId = employeeId;
	}

	public Employee(String name, int employeeId, String designation) 
	{
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getSalary() 
	{
		if(salary == 0.0)
		{
			setSalary();
		}
		salary = salary+salary*0.1;
		System.out.println(getName()+" salary is RS. "+salary);
	}

	public void setSalary() 
	{
		System.out.println("Enter salary of "+getName()+" : ");
		this.salary = sc.nextDouble();
	}	
}

public class GetSalaryMain
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Akshay", 111);
		
		Employee e2 = new Employee("Karan", 222, "Manager");
		
		e1.setSalary();
		
		e2.getSalary();
		
		e1.getSalary();
	}

}
