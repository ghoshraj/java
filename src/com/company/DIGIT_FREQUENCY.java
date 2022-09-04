package com.company;

import java.util.Scanner;

public class DIGIT_FREQUENCY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n1 = sc.nextInt();
        System.out.println("ENTER YOUR DIGIT:");
        int n2 = sc.nextInt();
        int count = 0;

        while ( n1 > 0){
            int dig = n1 % 10;
            n1 = n1 / 10;

            if (dig == n2){
                count++;
            }
        }
        System.out.println(count);
    }
}
