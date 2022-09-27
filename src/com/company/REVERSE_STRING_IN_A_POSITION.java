package com.company;

import java.util.Scanner;

public class REVERSE_STRING_IN_A_POSITION {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("enter the string -->");
        String str = sc.nextLine();
        System.out.println("enter the character where to print the string --->");
        char c = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++ ){

            if (str.charAt(i) == c){
                count++;

                if (count == 2){

                    for (int j = i - 2; j >= 0; j--){
                        System.out.println(str.charAt(j));
                    }
                    break;
                }
            }
        }
    }
}
