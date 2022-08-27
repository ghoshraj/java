package com.company;

import java.util.Scanner;

public class DIGIT_COUNT_OF_A_NUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR DIGIT :");
        int n = sc.nextInt();

        int dig =0;
        while (n != 0){
            n = n/10;
            dig++;
        }
        System.out.println(dig);
    }
}
