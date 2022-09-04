package com.company;

import java.util.Scanner;

public class BENJAMIN_BULBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();

        for (int i = 1; i * i <= n; i++){
            System.out.println(i*i);
        }
    }
}
