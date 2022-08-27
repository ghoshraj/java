package com.company;

class circle{
    int radius;
    public double area(){
        return (Math.PI*radius*radius);
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }

}
public class CIRCLE_DETAILS{
    public static void main(String[] args) {
        circle c = new circle();
        c.radius = 8;
        System.out.println("ARE OF THE CIRCLE IS :\n"+ c.area());
        System.out.println("PERIMETER OF THE CIRCLE IS :\n"+ c.perimeter());
    }
}
