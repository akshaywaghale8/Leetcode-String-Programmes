package com.akshu.javaLogical;

import java.util.Scanner;
/*Enter a String : fgh
f
fg
fgh
*/
public class String5 
{

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		for(int i = 0 ; i < str.length(); i++)
		{
			System.out.println(str.substring(0, i+1));
		}
	}
}
