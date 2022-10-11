package com.company;

import java.util.Scanner;

public class CHECK_ANAGRAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st string -->");
        String str1 = sc.nextLine();

        System.out.println("enter 2nd string -->");
        String str2 = sc.nextLine();

        anagram(str1 , str2);
    }
    public static void anagram(String str1 , String str2){
        int count[] = new int[256];
        for (int i = 0; i < str1.length(); i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < count.length; i++){
            if (count[i] != 0){
                System.out.println("this is not anagram");
            }
        }
        System.out.println("this is anagram");
    }
}
