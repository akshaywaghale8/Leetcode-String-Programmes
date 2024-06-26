package com.akshu.javaLogical;

import java.util.Scanner;

public class String23 
{
	public static boolean checkPrime(int num)
	{
		int count = 0;
		int i = 2;
		while(i <= num/2)
		{
			if(num % i == 0)
			{
				count++;
			}
			i++;
		}
		return count == 0;
	}
	
	public static void checkEmpiorNumber(int num)
	{
		int copy = num ;
		
		if(checkPrime(num))
		{
			int count = 0;
			int i = 2;
			while(copy != 0)
			{
				count = (count * 10)+(copy % 10) ;
				copy /= 10;
			}
			i = 2;
			copy = count ;
			count = 0;
			if(checkPrime(copy))
			{
				System.out.println(num+" is a EMPIOR Number!...");
			}
			else
			{
				System.out.println(num+" is not a EMPIOR Number!...");
			}
		}
		else
		{
			System.out.println(num+" is not a EMPIOR Number!...");
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Plaese Enter a number to check EMPOIR Number : ");
		int num = sc.nextInt();
		
		checkEmpiorNumber(num);
	}
}
