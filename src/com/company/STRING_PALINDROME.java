package com.company;

import java.util.Scanner;

public class STRING_PALINDROME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string-->");
        String str1 = sc.nextLine();
        String reverse ="";

        for (int i = str1.length() - 1; i >= 0; i--){
           // System.out.println(str1.charAt(i));
            reverse = reverse+str1.charAt(i);
        }
        if (str1.equals(reverse)){
            System.out.println("string is palindrome");
        }
        else {
            System.out.println("string is not palindrome");
        }
    }
}
