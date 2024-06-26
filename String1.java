package com.akshu.javaLogical;

import java.util.Scanner;

class C1
{
	public static int countCharectes(String str)
	{
		return str.length();
	}
}

public class String1
{
	public static void main(String [] args) 
	{
	 String x = "oxoxoxox"; 
	System.out.println("String before replacement :"+x);
	System.out.println("String after replacement :"+x.replace('x','T'));
	String y="Manager";
	System.out.println(y.replace("Man","Dam"));
	 }
}
