package com.akshu.javaLogical;

public class FlipcartMobileExchange 
{
	private String mobileName;
	private double mobileAge;
	private double currentMobilePrice;
	
	private double discount;

	public FlipcartMobileExchange(String mobileName, double mobileAge, double currentMobilePrice) {
		super();
		this.mobileName = mobileName;
		this.mobileAge = mobileAge;
		this.currentMobilePrice = currentMobilePrice;
	}
	
	public FlipcartMobileExchange()
	{
		
	}
	
	public double getCurrentMobilePrice() 
	{
		return currentMobilePrice;
	}


	public String getMobileName() 
	{
		return mobileName;
	}


	public double getMobileAge() 
	{
		return mobileAge;
	}
	
	public double getDiscount()
	{
		return discount;
	}
	
	public double getDiscount(FlipcartMobileExchange mb)
	{
		if(mb.getMobileAge() > 0 && mb.getMobileAge() < 1)
		{
			discount = currentMobilePrice - (currentMobilePrice *0.20);
			return discount;
		}
		else if(mb.getMobileAge() > 1 && mb.getMobileAge() < 2)
		{
			discount = currentMobilePrice - (currentMobilePrice *0.35);
			return discount;
		}
		else if(mb.getMobileAge() > 2 && mb.getMobileAge() < 3)
		{
			discount = currentMobilePrice - (currentMobilePrice *0.50);
			return discount;
		}
		else if(mb.getMobileAge() >= 3)
		{
			discount = currentMobilePrice - (currentMobilePrice *0.60);
			return discount;
		}
		else
		{
			return 0.0;
		}
			
	}
	
	public void buyNewMobile(FlipcartMobileExchange mb)
	{
		System.err.println("Exchange offer Unlocked");
		System.out.println("New mobile Bought with Exchange offer");
		System.out.println("you saved Rs."+mb.getDiscount(mb));
	}
	
	public void buyNewMobile()
	{
		System.out.println("New mobile Bought without Exchange offer");
	}
	

}
