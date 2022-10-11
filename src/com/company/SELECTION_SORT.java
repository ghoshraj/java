package com.company;

import java.util.Scanner;

public class SELECTION_SORT {
    public static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length - 1 ; i ++){
            int minimum = i;
            for (int j = i + 1; j < arr.length; j++){
                if (issmaller(arr , j , minimum)){
                    minimum = j;
                }
            }
            swap(arr , i , minimum);
        }
    }
    public static void swap(int[]arr , int i , int j){
        System.out.println("swapping" + " " + arr[i] + " " +  "and" + " " +arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static boolean issmaller(int[]arr , int i, int j){
        System.out.println("comparing" + " " + arr[i] + " " + "and" + " " + arr[j]);
        if (arr[i] < arr[j]){
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
        selectionsort(arr);
        print(arr);
    }
}
