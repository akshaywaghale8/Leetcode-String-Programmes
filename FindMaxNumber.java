package com.akshu.LogicalAssignments;

import java.util.Scanner;


public class FindMaxNumber
{
	public static int findMax(int n1 , int n2)
	{
		return n1>n2 ? n1 : n2 ;
	}
	
	public static int findMax(int n1 , int n2, int n3)
	{
		return n1>n2 ? n1 > n3 ? n1 : n3 : n2 ;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter a Number : ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter a Number : ");
		int num3 = sc.nextInt();
		
		int max2 = findMax(num2, num1);
		
		int max3 = findMax(num1, num3, num2);
		
		System.out.println(max2);
		
		System.out.println(max3);
		
	}

}
