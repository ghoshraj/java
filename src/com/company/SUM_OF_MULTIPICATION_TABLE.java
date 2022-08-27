package com.company;

import java.util.Scanner;

public class SUM_OF_MULTIPICATION_TABLE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();
        int sum = 0;
        for (int i =1; i<= 10; i++){
            sum = sum +n*i;
        }
        System.out.println("THE SUM OF THE MULTIPICATION TABLE IS :" + sum);
    }
}
