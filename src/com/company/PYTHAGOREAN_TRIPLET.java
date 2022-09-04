package com.company;

import java.util.Scanner;

public class PYTHAGOREAN_TRIPLET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1ST SIDE OF A TRIANGLE:");
        int n1 = sc.nextInt();
        System.out.println("ENTER 2ND SIDE OF A TRIANGLE:");
        int n2 = sc.nextInt();
        System.out.println("ENTER 3RD SIDE OF A TRIANGLE:");
        int n3 = sc.nextInt();
/*
        if(n1 > n2 || n1 > n3){
           boolean flag =  (n1 * n1 == (n2 * n2) + (n3 * n3));
            System.out.println(flag);
        }
        else if (n2 > n3 || n2>n1){
            boolean flag =  (n2 * n2 == (n1 * n1) + (n3 * n3));
            System.out.println(flag);
        }
        else {
            boolean flag =  (n3 * n3 == (n2 * n2) + (n1 * n1));
            System.out.println(flag);
        }

 */
        // ANOTHER ALGORITHM USE ------->

        int max = n1;
        if(n2 >= max){
            max = n2;
        }
         if(n3 >= max){
            max = n3;
        }

        if (max ==n1){
            boolean flag =  (n1 * n1 == (n2 * n2) + (n3 * n3));
            System.out.println(flag);
        }
        else if(max == n2){
            boolean flag =  (n2 * n2 == (n1 * n1) + (n3 * n3));
            System.out.println(flag);
        }
        else {
            boolean flag =  (n3 * n3 == (n2 * n2) + (n1 * n1));
            System.out.println(flag);
        }
    }
}
