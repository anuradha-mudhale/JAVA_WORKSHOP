package com.drivingprice;
import java.util.*;

public class Cal_dai_drivingCost {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total miles drive per day:");
		double  total_miles_drive_perDay = sc.nextDouble();
		System.out.println("Enter cost per gallon gassoline:");
		double cost_per_gallon_gassoline = sc.nextDouble();
		System.out.println("Enter avrage miles per gallon:");
		double avg_miles_pergallon = sc.nextDouble();
		System.out.println("Enter parking fees per day:");
		double parking_fees_perDay = sc.nextDouble();
		System.out.println("Enter tolls per day");
		double  tolls_perDay= sc.nextDouble();
		
		double  gallonsUsed = total_miles_drive_perDay/cost_per_gallon_gassoline;
		double fuelCost = gallonsUsed *  cost_per_gallon_gassoline;
		double totalCostPerDay = fuelCost + parking_fees_perDay+ tolls_perDay;
		System.out.println("daily driving cost:"+totalCostPerDay);
	}

}
