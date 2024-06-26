package com.akshu.javaLogical;

import java.util.Scanner;

public class String21 
{

	public static void main(String[] args) 
    {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter 1st String :");
		String str1 = sc.nextLine();
		
		char[] ch = str1.toCharArray();
		
		String cipher = "";
		
		for(char c : ch)
		{
			if((c >= 'A' && c < 'N' )|| (c < 'n' && c >= 'a'))
			{
				cipher +=  (char) (c + 13);
			}
		    else if(c >= 'N' && c <= 'Z') 
			{
					int n = (int)('Z' - c );
					cipher += (char)('a' +(12 - n)); 
			}
		    else if (c >='n' && c <= 'z')
		    {
		    	int n = (int)('z' - c) ;
				cipher += (char)('A' + (12 - n));
		    }
		    else
		    {
		    	cipher += c;
		    }
		}
		System.out.println("Encrypted messgae :");
		System.out.println(cipher);
		
		char[] ci = cipher.toCharArray();
		String decrypt = "";
		
		for(char c : ci)
		{
			
			if(c >='N' && c <= 'Z' || c >= 'n' && c <= 'z')
			{
				decrypt +=  (char) (c - 13);
			}
			else if(c >= 'A' && c < 'N')
			{
				int n = (int)('A' - c );
				decrypt += (char)('a' +(13 - n)); 
			}
			else if(c >'n' && c <= 'z')
			{
				int n = (int)('a' - c) ;
				decrypt += (char)('A' + (13 - n));
			}
		    else
		    {
		    	decrypt += c;
		    }
		}
		System.out.println("Decrypted messgae :");
		System.out.println(decrypt);
		
      }

}
