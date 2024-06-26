package com.akshu.javaLogical;

import java.util.Scanner;

public class String18 
{
	public static void displayFrequencyOfChar(String str)
	{
		char[] ch = str.toCharArray();
		int[] frequency = new int[ch.length];
		
		for(int i =0 ; i < ch.length ; i++)
		{
			int count = 1;
			for(int j = 0; j < ch.length ; j++)
			{
				if(ch[i] == ch[j] && i != j)
				{
					count++;
					ch[j] = '`';
					frequency[j] = '`';
				}
			}
			frequency[i] = count;
		}
		
		for(int i = 0 ; i < ch.length ; i++)
		{
			if(ch[i] != '`' && frequency[i] != '`' )
			{
				System.out.println(ch[i] +" : "+ frequency[i]);
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Name to find Name Plate : ");
		String str = sc.nextLine();
		
		displayFrequencyOfChar(str);
	}

}
