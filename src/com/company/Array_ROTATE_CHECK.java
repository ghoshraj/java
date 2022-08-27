package com.company;

public class Array_ROTATE_CHECK {

  //  public static int arr(int[]arr){

    public static void main(String[] args) {
            int value = 0;
            int arr[] = new int[2];
            for (int i =0; i<arr.length-1;i++){
                if (arr[i]>arr[i+1]){
                    value = i+1;
                    break;
                }
            }
        System.out.println(value);
        }
    }

