package com.akshu.javaLogical;

import java.util.Scanner;

public class String7 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void subStringExcludingLastIndex()
	{
		System.out.print("\nEnter a String to find sub String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the index from which you want to get sub string :");
		int index = sc.nextInt();
		
		String subStr = str.substring(index, str.length()-1);
		
		System.out.println(subStr);		
	}
	
	public static void converTOUpper()
	{
			System.out.print("\nEnter a String to convert into upper case : ");
			String str = sc.nextLine();
			str = sc.nextLine();
			String subStr = str.toUpperCase();
			System.out.println(subStr);	
			
	}
	
	public static void converTOLower()
	{
			System.out.print("\nEnter a String to to convert into Lower case : ");
			String str = sc.nextLine();
			str = sc.nextLine();
			String subStr = str.toLowerCase();
			System.out.println(subStr);	
	}

	public static void main(String[] args) 
	{
		subStringExcludingLastIndex();
		
		converTOLower();
		
		converTOUpper();
	}

}
