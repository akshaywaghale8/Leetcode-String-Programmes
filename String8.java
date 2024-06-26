package com.akshu.javaLogical;

import java.util.Scanner;

public class String8 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void converTOUpper()
	{
			System.out.print("\nEnter a String to convert into upper case : ");
			String str = sc.nextLine();
			
			char chArray[] = new char[str.length()];
			
			for(int i = 0 ; i < str.length(); i++)
			{
				if(str.charAt(i)  >= 'a' && str.charAt(i) <= 'z')
				{
					chArray[i] = (char)(str.charAt(i) - 32) ;
				}
				else
				{
					chArray[i] = str.charAt(i);
				}
			}
			
			System.out.println(chArray);
	}
	
	public static void converTOLower()
	{
			System.out.print("\nEnter a String to convert into Lower case : ");
			String str = sc.nextLine();
			
			char chArray[] = new char[str.length()];
			
			for(int i = 0 ; i < str.length(); i++)
			{
				if(str.charAt(i)  >= 'A' && str.charAt(i) <= 'Z')
				{
					chArray[i] = (char)(str.charAt(i) + 32) ;
				}
				else
				{
					chArray[i] = str.charAt(i);
				}
			}
			
			System.out.println(chArray);		
	}		

	public static void main(String[] args) 
	{
		converTOUpper();
		
		converTOLower();
	}

}
