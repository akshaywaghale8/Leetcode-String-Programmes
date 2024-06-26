package com.akshu.javaLogical;

import java.util.Scanner;

public class String16
{
	public static void searchNames(String []str , char ch)
	{
		System.out.println("Names Found Are:");
		for(String name : str)
		{
			String ele = name.toLowerCase();
			
			if(ch == ele.charAt(0))
			{
				System.out.println(name);
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String []names = new String[10];
		System.out.println("Enter 10 manes: ");
		for(int i = 0 ; i < 10; i++)
		{
			names[i] = sc.nextLine();
		}
	
		System.out.println("Enter the charecter to search name: ");
		char ch = sc.next().toLowerCase().charAt(0);
		
		searchNames(names, ch);
	}
}
