package com.company;

public class SORTED_ARRAY{
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 56;
        arr[1] = 36;
        arr[2] = 46;
        arr[3] = 66;
        arr[4] = 68;
        boolean issorted = true;
        for (int i = 0; i < arr.length ; i++){
            if(arr[i]>arr[i+1]){
                issorted =false;
                break;
            }
        }
        if(issorted){
            System.out.println("THE ARRAY IS SORTED");
        }
        else {
            System.out.println("THE ARRAY IS NOT SORTED");
        }
    }
}
