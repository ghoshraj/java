package com.company;

import java.util.Scanner;

public class ODD_NUMBER{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your input :");
        int n = sc.nextInt();
        for(int i = 0; i<= n; i++){
            System.out.println(2 * i +1);
        }
        System.out.println("end the program ");
    }
}
