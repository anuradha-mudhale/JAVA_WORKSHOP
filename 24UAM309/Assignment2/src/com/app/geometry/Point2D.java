package com.app.geometry;

public class Point2D {
    // Instance variables
    private double x;
    private double y;

    // Parameterized constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to get details as String
    public String getDetails() {
        return "Point Coordinates: x = " + this.x + ", y = " + this.y;
    }

    // Method to check if two points are equal
    public boolean isEqual(Point2D otherPoint) {
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }

    // Method to calculate distance
    public double calculateDistance(Point2D otherPoint) {
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}
