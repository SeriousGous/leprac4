package com.company;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}