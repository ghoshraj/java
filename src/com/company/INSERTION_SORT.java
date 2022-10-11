package com.company;

import java.util.Scanner;

public class INSERTION_SORT {
    public static void insertionsort(int [] arr){
        for (int i = 1; i < arr.length; i++){
            for (int j = i - 1; j >= 0; j --){
                if (isgreater(arr , j , j + 1)){
                    swap(arr , j , j + 1);
                }
                else {
                    break;
                }
            }
        }
    }
    public static void swap(int[]arr , int i , int j){
        System.out.println("swapping" + " " + arr[i] + " " +  "and" + " " +arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static boolean isgreater(int[]arr , int i, int j){
        System.out.println("comparing" + " " + arr[i] + " " + "and" + " " + arr[j]);
        if (arr[i] > arr[j]){
            return true;
        }
        else {
            return false;
        }
    }
    public static void print(int[]arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of the array is --->");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("enter element");
            arr[i] = sc.nextInt();
        }
        insertionsort(arr);
        print(arr);
    }
}
