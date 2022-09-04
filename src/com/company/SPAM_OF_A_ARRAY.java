package com.company;

import java.util.Scanner;

public class SPAM_OF_A_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF THE ARRAY -->");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("ENTER ELEMENT--->");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                System.out.println("MAXIMUM ELEMENT IN THIS ARRAY IS--> " + max);
            }
            if (arr[i] < min){
                min = arr[i];
                System.out.println("MINIMUM ELEMENT IN THIS ARRAY IS--> " + min);
            }
        }
        int spam = max-min;
        System.out.println(max + " - " + min + "=" + spam);
    }
}
