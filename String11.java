package com.akshu.javaLogical;

import java.util.Scanner;

public class String11 
{
	public static int sumOfTwoNumberInString(String s1, String s2)
	{
		int num1 = Integer.parseInt(s1);
		
		int num2 = Integer.parseInt(s2);
		
		int sum = num1 + num2;
		
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Frist number:");
		String n1 = sc.next();
		
		System.out.println("Enter Second number:");
		String n2 = sc.next();
		
		int sum = sumOfTwoNumberInString(n1, n2);

		System.out.println("Sum of Number is : "+sum);

	}
}