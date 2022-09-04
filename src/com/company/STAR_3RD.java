package com.company;

import java.util.Scanner;

public class STAR_3RD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1;j <= i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
