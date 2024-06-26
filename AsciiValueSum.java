package com.akshu.LogicalAssignments;

import java.util.Scanner;

public class AsciiValueSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Charecter : ");
		char ch1 = sc.next().charAt(0);
		
		System.out.print("Enter 2st Charecter : ");
		char ch2 = sc.next().charAt(0);
		
		int asciiSum = ch2 + ch1 ;
		
		int asciiDiff = ch2 - ch1 ;
		
		if(asciiDiff < 0)  {
			asciiDiff = -1 * (asciiDiff); 
		}
		
		System.out.println("The sum of Ascii Values : "+asciiSum);
		System.out.println("The Difference of Ascii Values : "+asciiDiff);
		
		

	}

}
