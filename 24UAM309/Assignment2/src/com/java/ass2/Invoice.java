package com.java.ass2;

public class Invoice {
	private String partNo;
	private String partDescription;
	private int quantity;
	private double price;
	Invoice(){
		
	}
	Invoice(String partNo,String partDescription,int quantity,double price){
		this.partNo=partNo;
		this.partDescription=partDescription;
		this.quantity=quantity;
		this.price = price;
		
	}
	public void setpartNo(String partNo)
	{
		this.partNo = partNo;
	}
	public void setpartDescription(String partDescription)
	{
		this.partDescription = partDescription;
	}
	public void setquantity(int quantity)
	{
		this.quantity=quantity;
	}

	public void setprice(Double price)
	{
		this.price = price;
	}
	public String getpartNo()
	{
		return this.partNo;
	}
	public String gerpartdesc()
	{
		return this.partDescription;
	}
	public int getquantity()
	{
		return this.quantity;
	}
	public double getprice()
	{
		return this.price;
	}
	public void calcInvoiceAmt()
	{
		if(quantity<=0)
		{
			this.quantity=0;
			System.out.println("Quantity is negative so by default quantity value is:"+this.quantity);
		}
		if(price<0)
		{
			this.price = 0.0;
			System.out.println("price is negative so by default price value is:"+this.price);
		}
		double res= this.quantity * this.price;
		System.out.println(" invoice amount :"+res); 
		
	}


}
