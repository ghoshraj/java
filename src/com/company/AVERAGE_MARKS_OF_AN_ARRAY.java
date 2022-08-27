package com.company;

public class AVERAGE_MARKS_OF_AN_ARRAY {
    public static void main(String[] args) {
        float[] arr = new float[5];
        arr[0] = 56.0f;
        arr[1] = 36.0f;
        arr[2] = 46.0f;
        arr[3] = 66.0f;
        arr[4] = 68.0f;
        float sum =0.0f;
        sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] ;
        System.out.println("THE AVERAGE OF THE ARRAY IS :"+ sum/arr.length);
    }
}
