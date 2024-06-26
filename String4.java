package com.akshu.javaLogical;

import java.util.Scanner;

public class String4
{
	public static boolean checkStartWithIgnorecase(String str1, String str2)
	{
		if((str1.toLowerCase()).startsWith(str2.toLowerCase()))
		{
			return true ;
		}
		else 
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.print("Enter a String to Check starting : ");
		String target = sc.nextLine();
		
		System.out.println("Is String Start with : "+checkStartWithIgnorecase(str, target));
	}

}
