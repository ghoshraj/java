package com.company;

import java.util.Scanner;

public class NUMBER_4TH_PRINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();
        int sp = n/2;
        int st = 1;
        int val = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            int val2 = val;
            for (int j = 1; j <= st; j++){
                System.out.print(val2 + "\t");
                if (j <= st / 2){
                    val2++;
                }
                else {
                    val2--;
                }
            }
            if (i <= n/2){
                sp--;
                st+=2;
                val++;
            }
            else {
                sp++;
                st-=2;
                val--;
            }
            System.out.println();
        }
    }
}
