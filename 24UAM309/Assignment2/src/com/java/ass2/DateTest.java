package com.java.ass2;

class DateTest{

	public static void main(String args[]) {
		System.out.print("Date display using parameterized constructor:");
		Date d1 =new Date(1,12,2005);
		d1.display();
		Date d2 = new Date();
		System.out.print("using setter:");
		d2.setmonth(5);
		d2.setday(15);
		d2.setyear(2005);
		d2.display();
		System.out.println("using getter:");
		System.out.println("day:"+d1.getday());
		System.out.println("Month:"+d1.getmonth());
		System.out.println("year:"+d1.getyear());
	}
	}