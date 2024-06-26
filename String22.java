package com.akshu.javaLogical;

import java.util.Scanner;

public class String22 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter 1st String :");
		String str1 = sc.nextLine();
		
		String[] subStr = str1.split(" ");
		
		String pSum = "";
		
		for(String s : subStr)
		{
			char[] ch = s.toUpperCase().toCharArray(); 
			int sum = 0 ;
			for(int i = 0 ; i < ch.length ; i++)
			{
				if(ch[i] >= 'A' && ch[i] <= 'Z')
				{
					int num = ch[i] - 64;
					sum = sum+num;	
				}
				else if(ch[i] >= '0' && ch[i] <= '9')
				{
					int num = ch[i] - 48;
					sum = sum+num;
				}
				else
				{
					sum += 1;
				}
			}
			pSum += sum +"  " ;
		}
		System.out.println(str1);
		System.out.println(pSum);
	}

}
