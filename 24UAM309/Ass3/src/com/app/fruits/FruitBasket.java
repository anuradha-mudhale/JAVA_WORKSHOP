package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];
        int counter = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display details & taste of all fresh fruits");
            System.out.println("6. Mark a fruit as stale");
            System.out.println("7. Display tastes of all stale fruits");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                case 1:
                    if (counter < basket.length) {
                        System.out.println("Enter Name, Color, Weight:");
                        String nm = sc.next();
                        String col = sc.next();
                        double wei = sc.nextDouble();
                        basket[counter++] = new Mango(nm, col, wei);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 2:
                    if (counter < basket.length) {
                        System.out.println("Enter Name, Color, Weight:");
                        String nm = sc.next();
                        String col = sc.next();
                        double wei = sc.nextDouble();
                        basket[counter++] = new Orange(nm, col, wei);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 3:
                    if (counter < basket.length) {
                        System.out.println("Enter Name, Color, Weight:");
                        String nm = sc.next();
                        String col = sc.next();
                        double wei = sc.nextDouble();
                        basket[counter++] = new Apple(nm, col, wei);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 4:
                    System.out.println("Names of all fruits:");
                    for (Fruit f : basket) {
                        if (f != null) {
                            System.out.println(f.getName());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Details & taste of fresh fruits:");
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f.toString() + " Taste: " + f.taste());
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter index to mark as stale: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < counter && basket[idx] != null) {
                        basket[idx].setFresh(false);
                        System.out.println("Marked fruit at index " + idx + " as stale.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 7:
                    System.out.println("Tastes of all stale fruits:");
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + " : " + f.taste());
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close();
    }
}
