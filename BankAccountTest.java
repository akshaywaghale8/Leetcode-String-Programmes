package com.akshu.LogicalAssignments;

class BankAccount
{
	private long accountNumber ;
	private String accountHolderName ;
	private int accountBalance;
	
	public BankAccount(long accountNumber, String accountHolderName, int accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public BankAccount(long accountNumber, String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}
	
	public void deposit(int amount)
	{
		if(amount < 1)
		{
			System.out.println("Amount is not Valid..... ");
		}
		else
		{
			accountBalance += amount;
			System.out.println(amount+" is Depoisited into Account of "+getAccountHolderName());
		}
	}
	
	public void withdraw(int amount)
	{
		if(amount > accountBalance)
		{
			System.out.println("Amount cannot withdraw from acoount");
		}
		else
		{
			accountBalance -= amount;
			System.out.println(amount+" is Withdraw from Account of "+getAccountHolderName());
		}
	}

	@Override
	public String toString() {
		return "Account Information \n [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	public void displayAccountInfo()
	{
		System.out.println(toString());
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}
	
}

public class BankAccountTest
{

	public static void main(String[] args)
	{
		BankAccount ac1 = new BankAccount(111111L, "akshay");
		BankAccount ac2 = new BankAccount(222222L, "Karan", 25000);
		
		ac1.deposit(10000);
		ac2.withdraw(10000);
		
		ac1.displayAccountInfo();
		ac2.displayAccountInfo();
	}

}
