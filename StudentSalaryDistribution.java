package com.akshu.javaLogical;

import java.util.Scanner;

public class StudentSalaryDistribution {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary is : ");
		double salary=sc.nextDouble();
		
		PlacedStudent ps1 = new PlacedStudent(salary);
		
		System.out.println("the Food Expense is : "+ps1.spendOnFood());
		
		System.out.println("the PG Expense is : " + ps1.spendOnPG());
		
		System.out.println("The activites Expense is :"+ps1.spendOnOtherActivities());
		System.out.println("The activites Expense is :"+ps1.spendOnOtherActivities());
		
		
		System.out.println("The Total Expense is :"+ps1.totalExpenceSpend());

		System.out.println("Savings is :"+ps1.savings());
		
		sc.close();
	}

}
