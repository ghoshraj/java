package com.company;

public class FIND_ELEMENT_IN_AN_ARRAY{
    public static void main(String[] args) {
        int[]arr = new int[5];
        arr[0] = 56;
        arr[1] = 36;
        arr[2] = 46;
        arr[3] = 66;
        arr[4] = 68;
        int num = 68;
        boolean Isanarray = false;
        for (int element:arr) {
            if (num == element) {
                Isanarray = true;
                break;
            }
        }
        if(Isanarray){
            System.out.println("this array is present");
        }
        else{
            System.out.println("THIS ARRAY IS NOT PRESENT");

        }
    }
}
