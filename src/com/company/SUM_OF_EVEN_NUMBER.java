package com.company;

import java.util.Scanner;

public class SUM_OF_EVEN_NUMBER{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum =sum +(2 * i);
        }
        System.out.println(sum);
    }
}
