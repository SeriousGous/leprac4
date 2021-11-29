package com.company;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,3);
        rectangle.setColor("Красный");
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square = new Square();
        square.setSide(5);
        square.setFilled(true);
        square.setColor("Синий");
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Circle circle = new Circle(5);
        circle.setColor("Зеленый");
        circle.setFilled(true);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}