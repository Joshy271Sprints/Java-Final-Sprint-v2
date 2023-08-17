package com.yourname;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 3);
        MyPoint p2 = new MyPoint(4, 0);
        MyRectangle rectangle = new MyRectangle(p1, p2);

        System.out.println("Rectangle: " + rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}