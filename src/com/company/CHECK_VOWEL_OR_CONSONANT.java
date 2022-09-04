package com.company;

import java.util.Scanner;

public class CHECK_VOWEL_OR_CONSONANT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER CHARACTER ---->");
        char n = sc.next().charAt(0);
        boolean isvowel = switch (n) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
        if (isvowel){
            System.out.println(n + "is a vowel ");
        }
        else {
            System.out.println(n + "is not a vowel");
        }
    }
}
