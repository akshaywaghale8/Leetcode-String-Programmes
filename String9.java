package com.akshu.javaLogical;

import java.util.Scanner;

public class String9 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void replaceSubString()
	{
			System.out.print("\nEnter Frist String : ");
			String str1 = sc.nextLine();
			System.out.print("\nEnter String to replace :");
			char ch1 = sc.next().charAt(0);
			System.out.print("\nEnter String to replace by :");
			char ch2 = sc.next().charAt(0);
			
			String supStr = str1.replace(ch1, ch2);
			System.out.println(supStr);
			
			String s = "";
			
			for(int i = 0 ; i < str1.length() ; i++)
			{
				char ch = str1.charAt(i);
				
				if(ch == ch1)
				{
				  s += ch2 ;	
				}
				else
				{
					s += ch;
				}	
			}
			
			System.out.println(s);		
	}
	
	public static void combineTwoString()
	{
			System.out.print("\nEnter Frist String to concat : ");
			String str1 = sc.nextLine();
			System.out.print("\nEnter Second String to Combine ");
			String str2 = sc.nextLine();
			
			String supStr = str1.concat(str2);
			String s = str1+str2;
			System.out.println(supStr + s);
			
	}
	
	public static void compairString()
	{
			System.out.print("\nEnter Frist String to Compair ");
			String str1 = sc.nextLine();
			System.out.print("\nEnter Second String to Compair ");
			String str2 = sc.nextLine();
			
			boolean isSame = str1.equals(str2);
			boolean flag = false;
			for(int i = 0 ; i < str1.length(); i++)
			{
				if(str1.charAt(i) == str2.charAt(i))
				{
					flag = true;
				}
				else
				{
					flag = false;
				}
				
				if(flag == false)
				{
					break ;
				}
			}
			
			if(isSame) 
			{
				System.out.println("Both the String are Identical");
			}
			else
			{
				System.out.println("Is Both the String are Not Identical");
			}
			
			if(flag) 
			{
				System.out.println("Both the String are Identical");
			}
			else
			{
				System.out.println("Is Both the String are Not Identical");
			}
	}
	
	public static void compairStringIgnoreCase()
	{
			System.out.print("\nEnter Frist String to Compair ");
			String str1 = sc.nextLine();
			System.out.print("\nEnter Second String to Compair ");
			String str2 = sc.nextLine();
			
			boolean isSame = str1.equalsIgnoreCase(str2);
			if(isSame) 
			{
				System.out.println("Both the String are Identical");
			}
			else
			{
				System.out.println("Is Both the String are Not Identical");
			}
	}
	
	public static void removeSpaceFromString()
	{
			System.out.print("\nEnter Frist String to Compair ");
			String str1 = sc.nextLine();
			
			String supStr = str1.trim();
			
			System.out.println(supStr);
	}
	
	public static void checkSuffixInString()
	{
			System.out.print("\nEnter Frist String ");
			String str1 = sc.nextLine();
			System.out.print("\nEnter Suffix to check: ");
			String str2 = sc.nextLine();
			
			boolean checker = str1.startsWith(str2);
			if(checker)
			{
				System.out.println("Given String Start with "+str2);
			}
			else
			{
				System.out.println("Given String do not Start with "+str2);	
			}
	}

	public static void main(String[] args) 
	{
		replaceSubString();
		
		combineTwoString();
		
		compairString();
		
		compairStringIgnoreCase();
		
		removeSpaceFromString();
		
		checkSuffixInString();
		
	}
}
