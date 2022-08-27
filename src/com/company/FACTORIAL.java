package com.company;

import java.util.Scanner;

public class FACTORIAL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();
        int i = 1;
        int factorial = 1;

        while (i <= n){
            factorial *=i;
            i++;
        }
        System.out.println("THE FACTORIAL IS :" + factorial);
    }
}
