package com.akshu.javaLogical;

public class FlipcartExchangeMain 
{

	public static void main(String[] args) 
	{
		FlipcartMobileExchange mb1 = new FlipcartMobileExchange("SamsungA20s", 3, 16000);
		
		mb1.buyNewMobile(mb1);
		
		FlipcartMobileExchange mb2 = new FlipcartMobileExchange();
		
		mb2.buyNewMobile();
		
		
	}

}
