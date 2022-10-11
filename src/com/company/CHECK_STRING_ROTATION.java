package com.company;

import java.util.Scanner;

public class CHECK_STRING_ROTATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st string--->");
        String str1 = sc.nextLine();

        System.out.println("enter 2nd string--->");
        String str2 = sc.nextLine();

        rotated(str1 , str2);
    }
    public static void rotated(String str1 , String str2){
        if (str1 == null || str2 == null){
            System.out.println("this is not rotate");
        }
        else if (str1.length() != str2.length()){
            System.out.println("this is not rotate");
        }
        else {
            String ans = str1 + str1;
            System.out.println("this is rotate");
        }
    }
}
