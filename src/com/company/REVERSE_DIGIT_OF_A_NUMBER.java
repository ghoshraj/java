package com.company;

import java.util.Scanner;

public class REVERSE_DIGIT_OF_A_NUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR DIGIT :");
        int n = sc.nextInt();

        while (n > 0){
            int dig = n % 10;
            n = n / 10;
            System.out.println(dig);
        }
    }
}
