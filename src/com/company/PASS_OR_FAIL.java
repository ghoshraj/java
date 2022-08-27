package com.company;

import java.util.Scanner;

public class PASS_OR_FAIL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num1");
        int num1 = sc.nextInt();

        System.out.println("enter your num2");
        int num2 = sc.nextInt();

        System.out.println("enter your num3");
        int num3 = sc.nextInt();

        int sum = num1+ num2 + num3;

        if(sum>270){
            System.out.println("you are awesome");
        }
        else if(sum>200){
            System.out.println("your number is good");
        }
        else if(sum>120){
            System.out.println("your number is average");
        }
        else if(sum>90){
            System.out.println("you are fail");
        }

    }
}
