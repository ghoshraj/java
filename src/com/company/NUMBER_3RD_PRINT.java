package com.company;

import java.util.Scanner;

public class NUMBER_3RD_PRINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int v = n * i;
            System.out.println(n + " * " + i + " = " + v);
        }
    }
}
