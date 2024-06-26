package com.akshu.javaLogical;

import java.util.Scanner;

public class String12 
{
	 String []names = new String[10] ;
	String []numbers = new String[10] ;
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void searchStudent(String []names, String numbers[], String name)
	{
		int count=0;
		boolean flag = false;
		for(int i =0 ; i< names.length ;i++)
		{
			if(names[i].equalsIgnoreCase(name))
			{
				flag = true;
				String presence = names[i]+" : "+numbers[i] ;
				System.out.println("Searching Student .....\n"+presence);
			}
		}
		
		if(flag == false)
		{
			System.out.println("Searching Student .....\nStudent not Found ");	
		}
	}
	
	public static void displayNames(String names[])
	{
		
		for(int i = 0 ; i < names.length ;i++)
		{
			String temp ;
			
			for(int j = i+1; j < names.length;j++)
			{
				if(names[i].compareToIgnoreCase(names[j]) > 0 )
				{
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		System.out.println("\n \nStudent Enrolled  Are: ");
		
		for(String name : names)
		{
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("How many students you want to store: ");
		int n = sc.nextInt();
		
		String []names = new String[n] ;
		String []numbers = new String[n] ;
		
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter Name of "+(i+1)+" Student");
			names[i] = sc.nextLine();
			names[i] = sc.nextLine();
			
			System.out.println("Enter Number of "+(i+1)+" Student");
			numbers[i]= sc.next();
		}

	 System.out.println("Enter a Name to Search: ");
	 String target = sc.nextLine();
	 target = sc.nextLine();
	 
	 searchStudent(names,numbers,target);

	 displayNames(names);
				
	}
}
