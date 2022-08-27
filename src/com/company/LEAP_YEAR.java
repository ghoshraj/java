package com.company;

import java.util.Scanner;

public class LEAP_YEAR{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you choose year :");
        int year = sc.nextInt();

        if(year % 4 == 0 || year % 100 ==0 && year % 400 == 0){
            System.out.println("this is a leap year");
        }
        else {
            System.out.println("this is not a leap year");
        }
    }
}
