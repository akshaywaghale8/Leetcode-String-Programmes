package com.akshu.javaLogical;

import java.util.Scanner;

public class NumberToWords 
{
	
	static String place1[] = {"zero" ,"one " ,"two " , "three " ,"four " ,"five " ,"six " ,"seven " ,"eight " ,"nine ","ten "};
	
	static String place2[] = { "elevan " , "twelve " ,"thirteen " ,"fourteen " ,"fifteen " ,"sixteen " ,"seventeen " ,"eighteen " ,"nineteen " };
	
	static String tenthPlace2[] = {"tweenty " ,"thirty " , "fourty " ,"fifty " ,"sixty " ,"seventy " ,"eighty " ,"ninety "  };
	
	static String place3[] = {"one hundred " ,"two hundred " , "three hundred " ,"four hundred " ,"five hundred " ,"six hundred " ,"seven hundred " ,"eight hundred " ,"nine hundred " };
	
	
	public static void getVoiceAssistance(int number)
	{
		System.out.print("Recived ");
		
		int dummy = number ;
		if(dummy < 11)
		{
			System.out.println(place1[dummy]);
		}
		else
		{
			int count = 0;
			
			while(dummy > 0)
			{
				count++;
				dummy = dummy / 10 ;
			}
			
			dummy = number ;
			int c = 0 ;
			
			
			
			while(count > 0 && dummy > 0 )
			{
				if(count > 3)
				{
					c = dummy / 1000;
					System.out.print(place1[c]+ "thousand ");
					count--;
					dummy = dummy - c * 1000;
				}
				else if(count > 2) 
				{
					c = dummy / 100;
					System.out.print(place3[c - 1]);
					count--;
					dummy = dummy - c * 100;
				}
				else if(count == 2 && dummy < 20  )
				{
					count--; 
					c = dummy % 10 ;
					System.out.print(place2[c - 1]);
					count--;
					dummy = 0;
				}
				else if (count == 2 && dummy > 19 )
				{ 
					c = dummy / 10  ;
					System.out.print(tenthPlace2[c - 2]);
					count--;
					dummy = dummy - c * 10;
					
				}
				if (count == 1 && dummy > 0)
				{ 
					c = dummy % 10  ;
					System.out.print(place1[c]);
					count--;
					dummy = dummy - c;
				}	
			}
		}
		System.out.println("Rupee on PAYTM.....");
	}

	public static void main(String[] args) 
	{
	  System.out.print("Enter value : ");
	  Scanner sc = new Scanner(System.in);
	  int num =  sc.nextInt();
	  sc.close();
	  
	  NumberToWords.getVoiceAssistance(num);

	}

}
