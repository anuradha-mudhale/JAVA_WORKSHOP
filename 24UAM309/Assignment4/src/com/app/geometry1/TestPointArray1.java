package com.app.geometry1;

import java.util.Scanner;

public class TestPointArray1 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of points to plot: ");
        n = sc.nextInt();

        Point2D[] p = new Point2D[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter x and y coordinates:");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            p[i] = new Point2D(x, y);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\n******** Menu ********");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display all points");
            System.out.println("3. Display distance between 2 points");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < p.length) {
                        System.out.println("Point at index " + idx + ": " + p[idx].getDetails());
                    } else {
                        System.out.println("Invalid index, please retry!");
                    }
                    break;

                case 2:
                    int i = 0;
                    for (Point2D point : p) {
                        System.out.println("Index " + i + ": " + point.getDetails());
                        i++;
                    }
                    break;

                case 3:
                    System.out.print("Enter index of start point: ");
                    int idx1 = sc.nextInt();
                    System.out.print("Enter index of end point: ");
                    int idx2 = sc.nextInt();

                    if ((idx1 >= 0 && idx1 < p.length) && (idx2 >= 0 && idx2 < p.length)) {
                        Point2D p1 = p[idx1];
                        Point2D p2 = p[idx2];

                        if (p1.isEqual(p2)) {
                            System.out.println("Both points are located at the same position.");
                        } else {
                            double dist = p1.calculateDistance(p2);
                            System.out.println("Distance between points: " + dist);
                        }
                    } else {
                        System.out.println("Invalid indices, please retry!");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }

        sc.close();
    }
}
