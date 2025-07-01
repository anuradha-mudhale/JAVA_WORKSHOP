package com.app.fruits;

public class Fruit {
    
    private String name;
    private String color;
    private double weight;
    private boolean isFresh;

    
    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = true; 
    }

    
    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

   
    public String getName() {
        return name;
    }

    
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
    }

  
    public String taste() {
        return "no specific taste";
    }
}
