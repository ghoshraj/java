package com.company;

class rectangle{
    int length;
    int width;
    public int area()
    {
        return length*width;
    }
    public int perimeter()
    {
        return 2*(length+width);
    }

}
public class RECTANGLE_DETAILS
{
    public static void main(String[] args)
    {
        rectangle t = new rectangle();
        t.length = 7;
        t.width = 9;
        System.out.println("AREA OF THE rectangle IS :\n" +t.area());
        System.out.println("PERIMETER OF THE rectangle IS :\n" +t.perimeter());
    }
}
