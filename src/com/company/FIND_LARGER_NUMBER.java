package com.company;

import java.util.Scanner;

public class FIND_LARGER_NUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER:");
        int num1 = sc.nextInt();

        System.out.println("ENTER 2ND NUMBER:");
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println("NUM1 IS BIGGEST NUMBER");
        }
        else if (num1<num2){
            System.out.println("NUM2 IS BIGGEST NUMBER");
        }
        else {
            System.out.println("BOTH ARE EQUALS");
        }
    }
}
