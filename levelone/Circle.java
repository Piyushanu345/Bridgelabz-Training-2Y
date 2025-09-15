package com.bridgelabz.oops.levelone;

class Circle {
    double radius;

    // constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
        System.out.println("Circumference of Circle: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        circle.displayDetails();
    }
}
