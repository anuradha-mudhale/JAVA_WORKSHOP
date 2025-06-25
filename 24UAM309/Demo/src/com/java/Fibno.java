package com.java;
import java.util.*;

public class Fibno {

	public static void main(String[] args) {
		int num1 = 0,num2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		for(int i=0;i<10;i++)
		{
			int num3 = num1+num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
		
	}

	
}
