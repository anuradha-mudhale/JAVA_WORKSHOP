package com.java;
import java.util.*;

public class GreatestNum {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		n1 = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		n2 = sc.nextInt();
		System.out.println("Enter the 3rd number:");
		n3 = sc.nextInt();
		if(n1>=n2&&n1>=n3)
		{
			System.out.println(n1+" is graetest number");
		}
		else if(n2>=n1&&n2>=n3)
		{
			System.out.println(n2+" is gratest number");
		}
		else
		{
			System.out.println(n3+" is greatest number");
		}

	}

}
