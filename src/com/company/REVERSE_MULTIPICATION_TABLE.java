package com.company;

import java.util.Scanner;

public class REVERSE_MULTIPICATION_TABLE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();
        for (int i = 10; i >= 1 ;i--){
            System.out.printf("%d X %d = %d \n",n ,i ,n*i);
        }
    }
}