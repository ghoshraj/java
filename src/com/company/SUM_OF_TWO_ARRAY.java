package com.company;

import java.util.Scanner;

public class SUM_OF_TWO_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SIZE OF A1[] ARRAY-->");
        int n1 = sc.nextInt();
        int [] a1 = new int[n1];
        for (int i = 0; i <a1.length; i++){
            System.out.println("ELEMENT OF A1[]-->");
            a1[i] = sc.nextInt();
        }
        System.out.println("SIZE OF A2[] ARRAY-->");
        int n2 = sc.nextInt();
        int [] a2 = new int[n2];
        for (int i = 0; i <a2.length; i++){
            System.out.println("ELEMENT OF A2[]-->");
            a2[i] = sc.nextInt();
        }
        int [] sum = new int[Math.max(n1, n2)];
        int c = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length -1;

        while (k >= 0){
            int d = c;

            if (i >= 0){
                d += a1[i];
            }
            if (j >= 0){
                d += a2[j];
            }
            c= d / 10;
            c = d % 10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if (c != 0){
            System.out.println(c);
        }
        for (int val:sum) {
            System.out.println(val);
        }
    }
}
