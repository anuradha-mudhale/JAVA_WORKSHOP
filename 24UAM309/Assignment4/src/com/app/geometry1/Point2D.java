package com.app.geometry1;

public class Point2D {
   
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "Point Coordinates: x = " + this.x + ", y = " + this.y;
    }

    public boolean isEqual(Point2D otherPoint) {
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }

    public double calculateDistance(Point2D otherPoint) {
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}
