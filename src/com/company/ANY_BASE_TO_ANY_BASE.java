package com.company;

import java.util.Scanner;


public class ANY_BASE_TO_ANY_BASE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();
        System.out.println("ENTER YOUR BASE :");
        int m = sc.nextInt();
        int rv = 0;
        int p = 1;

        while (n > 0){
            int dig = n % m;
            n = n / m;
            rv += dig * p;
            p = p * 8;
        }
        System.out.println(rv);
    }
}
