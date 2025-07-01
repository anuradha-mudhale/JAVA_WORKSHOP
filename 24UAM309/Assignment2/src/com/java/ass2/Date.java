package com.java.ass2;

public class Date {
	private int month;
	private int day;
	private int year;
	Date()
	{
		
	}
	Date(int month,int day,int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public void setmonth(int month)
	{
		this.month = month;
	}
	public int getmonth()
	{
		return this.month;
	}
	public void setday(int day)
	{
		this.day = day;
	}
	public int getday()
	{
		return day;
	}
	public void setyear(int year)
	{
		this.year = year;
	}
	public int getyear()
	{
		return this.year;
	}
	public void display()
	{
		System.out.printf("%d/%d/%d\n",this.month,this.day,this.year);
	}
	

}
