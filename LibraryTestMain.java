package com.akshu.LogicalAssignments;

class Library
{
	private String libraryName;
	private String libraryLocation;
	private String members = "";
	private int numberOfBooks = 100 ;
	private int borrowedBook = 0;
	
	public Library(String libraryName)
	{
		super();
		this.libraryName = libraryName;
	}
	
	public Library(String libraryName, String libraryLocation)
	{
		super();
		this.libraryName = libraryName;
		this.libraryLocation = libraryLocation;
	}
	
	public void addMember(String name)
	{
		members += name ;
		System.out.println(name + " is added into members.....");
	}
	
	public void addBook(int amount)
	{
		if(amount > 0)
		{
			numberOfBooks += amount ;
			System.out.println(amount + " Books are added into library....");
		}
		else
		{
			System.out.println("invalid books numbers....");
		}
	}
	
	public void borrowBook(int amount)
	{
		if(amount > 0)
		{
			numberOfBooks -= amount ;
			borrowedBook +=  amount ;
			System.out.println(amount + " Books are borrowed from library....");
		}
		else
		{
			System.out.println("invalid books numbers....");
		}
	}
	
	public void returnBook(int amount)
	{
		if(amount > 0)
		{
			numberOfBooks += amount ;
			borrowedBook -=  amount ;
			System.out.println(amount + " Books are borrowed from library....");
		}
		else
		{
			System.out.println("invalid books numbers....");
		}
	}
	
	
	public int getBorrowedBook() {
		return borrowedBook;
	}

	@Override
	public String toString() 
	{
		return "Library [libraryName=" + libraryName + ", libraryLocation=" + libraryLocation + ", members=" + members
				+ ", numberOfBooks=" + numberOfBooks + ", borrowedBook=" + borrowedBook + "]";
	}	
}

public class LibraryTestMain
{
	public static void main(String[] args) 
	{
		Library lib1 = new Library("Harshdeep");
		Library  lib2 = new Library("Navyuvak", "Ameerpeth");
		
		lib1.addBook(10);
		lib2.borrowBook(10);
		
		lib1.getBorrowedBook();
		lib2.addMember("Akshay");
		
		lib2.returnBook(5);
		
		System.out.println(lib1);
		System.out.println(lib2);
		
	}
}
