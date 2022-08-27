package com.company;

public class FIBONANCIAL_SERIES{

    static int fibonanci(int n){
        if(n==2 || n==1){
            return n-1;
        }
        return fibonanci(n-1)+fibonanci(n-2);
    }
    public static void main(String[] args) {
        int result =fibonanci(5);
        System.out.println(result);
    }
}

