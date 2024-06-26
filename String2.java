package com.akshu.javaLogical;

import java.util.Scanner;
/*
Enter a String : Akshay
A 
A k 
A k s 
A k s h 
A k s h a 
A k s h a y  */

public class String2 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();	
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			for(int j = 0 ; j <= i ; j++)
			{
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}
