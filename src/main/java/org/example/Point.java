package org.example;

public class Point {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter metodları
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public double distance() {
        return Math.sqrt(x * x + y * y);
    }


    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
    }


    public double distance(int a, int b) {
        return Math.sqrt(Math.pow(a - this.x, 2) + Math.pow(b - this.y, 2));
    }
}
