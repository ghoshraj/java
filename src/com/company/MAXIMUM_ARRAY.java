package com.company;

public class MAXIMUM_ARRAY{
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 56;
        arr[1] = 36;
        arr[2] = 46;
        arr[3] = 66;
        arr[4] = 68;
        int max = 0;
        for(int e :arr){
            if(e>max) {
                max = e;
            }
        }
        System.out.println("THE MAXIMUM VALUE OF THE ARRAY IS :"+ max);
    }
}
