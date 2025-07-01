package com.app.geometry;

import java.util.Scanner;
//import com.app.geometry.Point2D;

public class TesterPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coordinates for Point 1
        System.out.println("Enter x and y for Point 1:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Input coordinates for Point 2
        System.out.println("Enter x and y for Point 2:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Create Point2D objects
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        // Display details
        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        // Check if equal
        if (p1.isEqual(p2)) {
            System.out.println("Points are at the same position.");
        } else {
            System.out.println("Points are at different positions.");
            double distance = p1.calculateDistance(p2);
            System.out.println("Distance between points: " + distance);
        }

        sc.close();
    }
}
