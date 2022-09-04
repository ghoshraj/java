package com.company;

import java.util.Scanner;

public class DIFFERENCE_OF_TWO_ARRAY {
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
        int [] diff = new int[n2];
        int c =0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        while (k >= 0){
            int dig = 0;
            int a1v = i >= 0? a1[i]: 0;

            if (a2[j] + c >= a1v){
                dig = a2[j] + c - a1v;
                c = 0;
            }
            else {
                dig = a2[j] + c + 10 - a1v;
                c = -1;
            }
            diff[k] = dig;

            i--;
            j--;
            k--;
        }
        int index = 0;
        while (index < diff.length){
            if (diff[index] == 0){
                index++;
            }
            else {
                break;
            }
        }
        while (index < diff.length){
            System.out.println("DIFFERENCE BETWEEN TWO ARRAY IS -->" + diff[index]);
            index++;
        }
    }
}
