package com.akshu.javaLogical;

import java.util.Scanner;

public class String17 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void namePlate()
	{
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		String subStr = str.toUpperCase();
		
		String word[] = subStr.split(" ");
		
		int i = 0 ;
		for(i = 0 ; i < word.length-1 ; i++ )
		{
			char ch = word[i].charAt(0);
			System.out.print(ch + ". ");
		}
		
		System.out.println(word[i]);	
	}

	public static void main(String[] args) 
	{
		namePlate();	
	}
}
