package com.company;

import java.util.Scanner;

public class SEARCHING_ARRAY_INDEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF THE ARRAY -->");
        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            System.out.println("ENTER ELEMENT--->");
            ar[i] = sc.nextInt();
        }
        System.out.println("ENTER ELEMENT TO COMPARE -->");
        int m = sc.nextInt();
        int index = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == m){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
