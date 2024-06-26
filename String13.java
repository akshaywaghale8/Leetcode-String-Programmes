package com.akshu.javaLogical;

import java.util.Scanner;

public class String13
{
	static Scanner sc = new Scanner(System.in);
	
	
	public static void displayInitials()
	{
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		int i=0;
		for(i = 0; i < ch.length ; i++)
		{
			boolean p = ch[i] != ' ';
			int call = i;
			while(p && i < ch.length - 1)
			{
				if(call == i)
				{
					System.out.print(ch[i]+ ". ");
				}
				i++;
				if(ch[i] == ' ')
				{
					i--;
					break;
				}
			}
		}	
			
	}
	
	public static void removeVowel()
	{
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		str = sc.nextLine();
		
		String subStr ="";
		
		for(int i = 0 ; i < str.length(); i++ )
		{
			char ch = str.toLowerCase().charAt(i);
			
			if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			{
				
			}
			else
			{
				subStr += ch;
			}
		}
		System.out.println("String after removing Vowels is : \n"+subStr);
		
	}
	
	public static void searchState(String []names, String numbers[], String name)
	{
		int count=0;
		boolean flag = false;
		for(int i =0 ; i< names.length ;i++)
		{
			if(names[i].equalsIgnoreCase(name))
			{
				flag = true;
				String presence = names[i]+" : "+numbers[i] ;
				System.out.println("Searching State .....\n"+presence);
			}
		}
		
		if(flag == false)
		{
			System.out.println("Searching State .....\nState not Found ");	
		}
	}
	public static void main(String[] args)
	{
		
		
		System.out.println("How many State you want to store: ");
		int n = sc.nextInt();
		
		String []states = new String[n] ;
		String []capitals = new String[n] ;
		
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter Name of "+(i+1)+" State");
			states[i] = sc.next();
		
			System.out.println("Enter Number of "+(i+1)+" State");
			capitals[i]= sc.next();
		}
		
		System.out.println("Enter a Name to Search: ");
		String target = sc.next();
		 
		searchState(states, capitals, target);
		
		removeVowel();
		
		displayInitials();
			
	}

}
