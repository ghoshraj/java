package com.company;

import java.util.Scanner;

public class INVERSE_OF_A_NUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR DIGIT :");
        int n = sc.nextInt();

        int inv = 0; //inv-->inverse
        int op = 1;  //op-->original_place
        while (n != 0){
            int od = n % 10; //od--->original digit
            int id = op;  //id-->inverted digit
            int ip = od;  //ip-->inverted position

            inv = inv +id * (int)Math.pow(10, ip -1);

            n = n/10;
            op++;
        }
        System.out.println("YOUR INVERSE DIGIT IS:");
        System.out.println(inv);
    }
}
