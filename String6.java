package com.akshu.javaLogical;

import java.util.Scanner;

public class String6 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void findLengthOfString() 
	{
		System.out.print("\nEnter a String to find length of String: ");
		String str = sc.nextLine();
		
		int length = str.length();
		System.out.println("Length of String is : "+length);
		
	}
	
	public static void charAtIndex()
	{
		System.out.print("\nEnter a String to find charecter at given Index: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the index to fetch the char :");
		int index = sc.nextInt();
		
		char ch = str.charAt(index);
		
		System.out.println("charecter present at "+index+" is "+ch);
	}
	
	public static void findFristOccurance()
	{
		System.out.print("\nEnter a String to find Frist occurance of charecter in String: ");
		String str = sc.nextLine();
				str = sc.nextLine();
		        
		System.out.println("Enter the char to get the position :");
		char ch =  sc.next().charAt(0);
		
		int position = str.indexOf(ch)+1;
		
		if(position > 0) 
		{
			System.out.println(ch+" is frist time available at : "+ position+" Position");
		}
		else
		{
			System.out.println("Charaecter is not present in the String.");
		}
	}
	
	public static void searchAvailabiltyFromIndex()
	{
		System.out.print("\nEnter a String to search Availabilty of charecter grom givemn index : ");
		String str = sc.nextLine();
			str = sc.nextLine();
		
		System.out.println("Enter the char to get the position :");
		char ch =  sc.next().charAt(0);
			
	    System.out.println("Enter the index from which you want to search :");
		int index = sc.nextInt();
		
		int available = str.indexOf(ch, index);
	
		if(available < 0)
		{
			System.out.println("Charecter is not present from given index");
		}
		else
		{
			System.out.println(ch+" is present at "+(available+1)+" Position");
		}			
	}
	
	public static void subStringFromIndex()
	{
		System.out.print("\nEnter a String to finf length of String: ");
		String str = sc.nextLine();
		str = sc.nextLine();
		
		
		System.out.println("Enter the index from which you want to get sub string :");
		int index = sc.nextInt();
		
		String sub = str.substring(index);
		
		System.out.println(sub);
	}
	
	public static void findLastOccurance()
	{
		System.out.print("\nEnter a String to convert into char Array : ");
		String str = sc.nextLine();
			str = sc.nextLine();
			
		System.out.println("Enter the char to get the position :");
		char ch =  sc.next().charAt(0);	
		
		int position = str.lastIndexOf(ch);
		
		if(position < 0)
		{
			System.out.println("Charecter is not present from given index");
		}
		else
		{
			System.out.println(ch+" is last time occure at "+(position+1)+" Position");
		}
		
			
			
	}
	
	public static void convertToCharArray()
	{
		System.out.print("\nEnter a String to convert into char Array : ");
		String str = sc.nextLine();
			str = sc.nextLine();
			
		char ch[]=str.toCharArray();
		
		System.out.println("Charrecter sequence is :");
		for(char c : ch)
		{
			System.out.print(c+" , ");
		}
		
	}

	public static void main(String[] args) 
	{	
		findLengthOfString();

		charAtIndex();
		
		findFristOccurance();
		
		searchAvailabiltyFromIndex();
		
		findLastOccurance();
		
		convertToCharArray();
		
		subStringFromIndex();
		
	}

}
