package com.company;

import java.util.Scanner;

public class OCTAL_BASE_SUBSTRACTION {
    public static void main(String[] args) {
        int b = 8;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR 1ST OCTAL NUMBER :");
        int n1 = sc.nextInt();
        System.out.println("ENTER YOUR 2ND OCTAL NUMBER :");
        int n2 = sc.nextInt();
        int rv = 0;
        int c = 0;
        int power = 1;

        while ( n2 > 0){
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int dig = 0;
            dig2 = dig2 + c;

            if (dig2 >= dig1){
                c = 0;
                dig = dig2 - dig1;
            }
            else {
                c = -1;
                dig  = dig2 + 8 - dig1;
            }
            rv = rv + dig * power;
            power = power * 10;
        }
        System.out.println(rv);
    }
}
