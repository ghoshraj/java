package com.company;

import java.util.Scanner;

public class OCTAL_BASE_SUM {
    public static void main(String[] args) {
        int b = 8;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR 1ST OCTAL NUMBER :");
        int n1 = sc.nextInt();
        System.out.println("ENTER YOUR 2ND OCTAL NUMBER :");
        int n2 = sc.nextInt();
        int c = 0;
        int rv = 0;
        int power = 1;

        while (n1 > 0 || n2 > 0 || c > 0){
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int sum = dig1 + dig2 + c;
            c = sum / b;
            sum = sum % b;

            rv += sum * power;
            power = power * 10;
        }
        System.out.println(rv);
    }
}
