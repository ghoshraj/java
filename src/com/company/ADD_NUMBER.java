package com.company;

import java.util.Scanner;

public class ADD_NUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your output:");

        System.out.println("enter number 1 :");
        int n = sc.nextInt();
        System.out.println("enter number 2 :");
        int j = sc.nextInt();
        System.out.println("enter number 3 :");
        int k = sc.nextInt();

        int sum =n + j + k;
        System.out.println("sum of these number are :" + sum);
    }
}