package com.company;

public class MINIMUM_ARRAY{
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 56;
        arr[1] = 36;
        arr[2] = 46;
        arr[3] = 66;
        arr[4] = 68;
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("THE MAXIMUM VALUE OF THE ARRAY IS :"+ min);
    }
}

