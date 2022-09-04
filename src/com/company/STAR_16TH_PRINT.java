package com.company;

import java.util.Scanner;

public class STAR_16TH_PRINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR ODD NUMBER :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if(j == 1 || j == n){
                    System.out.print("*\t");
                }
                else if (i > n / 2 && (i + j == n + 1 || i == j)){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
