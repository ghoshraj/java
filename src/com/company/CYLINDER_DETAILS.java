package com.company;

class cylinder{
    private int radius;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double area(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    public void print(){
        System.out.println("THE VOLUME OF THE CYLINDER IS:\n" + volume());
        System.out.println("THE AREA OF THE CYLINDER IS:\n" + area());
    }
}
public class CYLINDER_DETAILS{
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.setRadius(7);
        c.setHeight(9);
        c.print();
    }
}
