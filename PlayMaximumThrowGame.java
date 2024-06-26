package com.akshu.LogicalAssignments;

import java.util.Random;

class Game
{
	private String name ;
	private int playerNumber ;
	int count = 0 ;
	
	public Game(String name, int playerNumber)
	{
		super();
		this.name = name;
		this.playerNumber = playerNumber;
	}
	
	public String getName() {
		return name;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public  int diceThrow()
	{
		int sum = 0 ;
		System.out.print(getName()+" is playing :");
		while(sum < 20)
		{
			double random = Math.random() * 5 + 1;
	        // Convert the double to an integer.
	        int digit = (int) random;
			sum += digit;
			System.out.print(digit+" ");
			count++;
		}
		System.out.println();
		return count;
	}
}
public class PlayMaximumThrowGame 
{
	public static void main(String[] args) 
	{
		Game p1 = new Game("Kaustubh", 1);
		Game p2 = new Game("Akshay", 2);
		
		int co1 = p1.diceThrow();
		int co2 = p2.diceThrow();
		
		if(co1 > co2) 
		{
			System.out.println(p1.getName()+" is Winner..") ;
		}
		else if(co1 < co2)
		{
			System.out.println(p2.getName()+" is Winner..") ;
		}
		else
		{
			System.out.println("Match tie....");
		}
	}
}
