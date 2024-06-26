package com.akshu.javaLogical;

import java.util.Scanner;

public class String14 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void maxLenthWord(String str)
	{
		String []sub = str.split(" ");
		int count = 0;
		int max = count;
		int []ch = new int[sub.length];
		
		int i =0;
		for(String word : sub)
		{
			count = word.toCharArray().length;
			ch[i] = count;
			i++;
			if(count >= max)
			{
				max = count;
			}
		}
		System.out.println("Largest Word : ");
		for(i =0 ; i < ch.length ; i++)
		{
			if(ch[i] == max)
			{
				System.out.println(sub[i]);
			}
		}
	}
	
	
	public static void pallindromWord(String str)
	{
		String[] subStr = str.split(" ");
		
		System.out.println("Pallaindrom Strings Are : ");
		for(String ele : subStr)
		{
			if(ele != " ")
			{
				int n = ele.length();
				
				int start =0, end = ele.length()-1;
				boolean flag = false;
				
				for(start =0 ; start <= n/2 ;start++ , end --)
				{
					if(ele.charAt(end) == ele.charAt(start))
					{
						flag = true;
					}
					else
					{
						flag = false;
					}
					if(flag == false)
					{
						break;
					}
				}
			
				if(flag == true)
				{
					System.out.println(ele);
				}
			}	
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter a String to find lardest Word : ");
		String str = sc.nextLine();
		
		maxLenthWord(str);
		
		System.out.println("Enter a String to find pallindrom Word : ");
		 str = sc.nextLine();
		
		pallindromWord(str);
	}
}




