package com.java.ass2;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice  i1 = new Invoice("101A","Ai machine",-10,-5);
//		i1.setprice(10.0);
//		i1.setquantity(5);
		System.out.println(("quantity:"+i1. getquantity()));
		System.out.println(("price:"+i1. getprice()));
		
		i1.calcInvoiceAmt();
		
	}

}
