package com.akshu.LogicalAssignments;

class ParkingLot {
	private String vehicalNo;
	private int hours;
	private double bill;

	public ParkingLot(String vehicalNo, int hours) {
		super();
		this.vehicalNo = vehicalNo;
		this.hours = hours;
	}

	public void calculate() {
		bill = 30;
		hours--;
		bill += hours * 1.50;

		System.out.println("Vahical Number : " + vehicalNo);
		System.out.println("Bill : Rs. " + bill + "\n");
	}

}

public class BillCheckTest {
	public static void main(String[] args) {
		ParkingLot p1 = new ParkingLot("kn13", 1);
		p1.calculate();

		ParkingLot p2 = new ParkingLot("13kya", 6);
		p2.calculate();
	}
}
