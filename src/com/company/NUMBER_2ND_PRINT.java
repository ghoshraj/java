package com.company;

import java.util.Scanner;

public class NUMBER_2ND_PRINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int val = 1;
            for (int j = 0; j <= i; j++){
                System.out.print(val + "\t");
                int val2 = val * (i - j)/(j + 1);
                val = val2;
            }
            System.out.println();
        }
    }
}
