package com.akshu.javaLogical;

import java.util.Scanner;

public class String10 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void converToOppositeCase()
	{
			System.out.print("\nEnter a String to convert into upper case : ");
			String str = sc.nextLine();
			
			String chAray ="";
			
			for(int i = 0 ; i < str.length(); i++)
			{
				if(i%2 == 0)
				{
					if(str.charAt(i)  >= 'a' && str.charAt(i) <= 'z')
					{
						char ch = (char)(str.charAt(i) - 32) ;
						chAray += ch;
					}
					else if(str.charAt(i)  >= 'A' && str.charAt(i) <= 'Z')
					{
						char ch = (char)(str.charAt(i) + 32) ;
						chAray += ch;
					}
					else
					{
						chAray += str.charAt(i);
					}
				}
				else
				{
					chAray += str.charAt(i);
				}
			}
			
			System.out.println(chAray);
	}

	public static void main(String[] args) 
	{
		converToOppositeCase();

	}

}
