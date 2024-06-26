package com.akshu.javaLogical;

import java.util.Scanner;

public class String20 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter 1st String :");
		String str1 = sc.nextLine();
		
		System.out.println("Enter 2nd String :");
		String str2 = sc.nextLine();
		
		String combine = "" ;
		
		int n = Math.max(str1.length(), str2.length());
		int i =0 ;
		int j = str2.length()-1 ;
		
		while(n != 0)
		{
			if(i <= str1.length()-1)
			{
				combine += str1.charAt(i++);
			}
			if(j >= 0)
			{
				combine += str2.charAt(j--);
			}
			n--;
		}
		
//		for( i = 0 , j = str2.length()-1 ;i <= n; i++ , j--)
//		{
//			if(i <= str1.length()-1)
//			{
//				combine += str1.charAt(i);
//			}
//			if(j >= 0)
//			{
//				combine += str2.charAt(j);
//			}
//			
//			if(i >= str1.length()  && j < 0)
//			{
//				break ;
//			}
//		}
		
		System.out.println(combine);
		
	}

}
