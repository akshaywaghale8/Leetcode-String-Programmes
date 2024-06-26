package com.akshu.LogicalAssignments;

import java.util.Scanner;

public class PsudoArithmaticSequence 
{
	public static boolean checkPsudoAP(int[] arr)
	{
		int n = arr.length;
		int diff = arr[0] + arr[n-1];
		boolean flag = true; 
		if(n % 2 == 0)
		{
			for(int i = 1, j = n-2;i<n/2; i++, j--)
			{
				if(diff != arr[i]+arr[j])
				{
					flag = false;
					break;
				}
			}
		}
		else
		{
			for(int i = 1, j = n-2;i <= n/2; i++, j--)
			{
				if(i == n/2 )
				{
					if(arr[i]+arr[i] != diff) flag = false;
				}
				if(diff != arr[i]+arr[j])
				{
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	                                               
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements you want to store In A.P. :-");
		int size = sc.nextInt();
		int arrAP[] = new int[size];
		
		System.out.println("Enter "+size+" Elements :");
		for(int i = 0; i < size ; i++)
		{
			arrAP[i] = sc.nextInt();
		}
		System.out.println(checkPsudoAP(arrAP));
	}
}
