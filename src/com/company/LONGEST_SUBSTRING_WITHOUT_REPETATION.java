package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class LONGEST_SUBSTRING_WITHOUT_REPETATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string-->");
        String str = sc.nextLine();
        longest(str);
    }
    public static void longest(String str){
        HashSet<Character> set = new HashSet<>();
        String longestoverall = "";
        String longesttillnow = "";

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (set.contains(c)){
                longesttillnow = "";
                set.clear();
            }
            set.add(c);
            longesttillnow += c;

            if (longesttillnow.length() > longestoverall.length()){
                longestoverall = longesttillnow;
            }
            System.out.println(longestoverall);
        }
    }
}
