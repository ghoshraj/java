package com.company;

import java.util.Scanner;

public class STAR_4TH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--){
            for (int j = 1;j <= i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
