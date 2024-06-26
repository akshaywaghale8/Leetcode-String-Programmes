package com.akshu.javaLogical;

import java.util.Scanner;

public class String15 
{
	public static void findMaxVowelWords(String str)
	{
		String []sub = str.split(" ");
		int count = 0;
		int max = count;
		int []ch = new int[sub.length];
		
		int i =0;
		for(String word : sub)
		{
			count = 0 ;
			
			String ele = word.toLowerCase();
			
			for(int j = 0 ; j < ele.length(); j++ )
			{
				char ch1 = ele.charAt(j);
				if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
				{
					count++;
				}
			}
			ch[i] = count;
			i++;
			
			if(count >= max)
			{
				max = count;
			}
		}
		
		System.out.println("Word Contains maximum vowels : ");
		for(i = 0 ; i < ch.length ; i++)
		{
			if(ch[i] == max)
			{
				System.out.println(sub[i]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to find lardest Word : ");
		String str = sc.nextLine();
		
		findMaxVowelWords(str);	
	}
}
