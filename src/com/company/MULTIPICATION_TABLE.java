package com.company;

import java.util.Scanner;

public class MULTIPICATION_TABLE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int n = sc.nextInt();
        for (int i = 1; i <= 10 ;i++){
            System.out.printf("%d X %d = %d \n",n ,i ,n*i);
        }
    }
}
