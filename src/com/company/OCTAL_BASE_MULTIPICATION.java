package com.company;

import java.util.Scanner;

public class OCTAL_BASE_MULTIPICATION {
    public static void main(String[] args) {
        int b = 8;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR 1ST OCTAL NUMBER :");
        int n1 = sc.nextInt();
        System.out.println("ENTER YOUR 2ND OCTAL NUMBER :");
        int n2 = sc.nextInt();
        int d = getproduct(b , n1 , n2);
        System.out.println(d);
    }
    public static int getproduct(int b , int n1 ,int n2) {
        int rv = 0;
        int power = 1;

        while (n2 > 0){
           int d2 = n2 % 10;
           n2 = n2 / 10;

           int sproduct = getproductwithasingledigit(b , n1 , d2);
           rv = getsum(b , rv ,sproduct * power);
           power = power * 10;
        }

        return rv;

    }
    public static int getproductwithasingledigit (int b , int n1 , int d2){
        int rv = 0;
        int c = 0;
        int power = 1;

        while (n1 > 0 || c > 0){
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int d = d1 * d2 + c;
            c = d / b;
            d = d % b;

            rv = rv + d * power;
            power = power * 10;
        }

        return rv;
    }
    public static int getsum(int b , int n1 , int n2){
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
        return rv;
    }
}
