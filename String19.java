package com.akshu.javaLogical;

public class String19 
{

	public static void main(String[] args)
	{
		String arr[] = {"001", "002", "003", "004", "005", "006", "007"};
		
		int a[] = new int[arr.length];
		
		int k = 0;
		
		for(String str : arr)
		{
			char[] ch = str.toCharArray();
			int n = ch.length / 2 ;
			char temp ;
			for(int i =0; n > i  ; i++)
			{
				 for(int j = ch.length-1 ;n < j ; j--)
				 {
					 temp = ch[i];
					 ch[i] = ch[j];
					 ch[j] = temp ;
				 }
			}
			String ch1 = "";
			for(char c : ch)
			{
				ch1 += c;
			}
			
			a[k] = Integer.parseInt(ch1);
			k++;
		}
		
		for (int num : a)
		{
			System.out.println(num);
		}
	}

}
