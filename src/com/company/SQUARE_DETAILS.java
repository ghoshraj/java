package com.company;

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class SQUARE_DETAILS{
    public static void main(String[] args) {
        square s = new square();
        s.side = 6;
        System.out.println("AREA OF THE SQUARE IS:");
        System.out.println(s.area());
        System.out.println("PERIMETER OF THE SQUARE IS :");
        System.out.println(s.perimeter());
    }
}
