package com.company;

import java.util.Scanner;

public class CALCULATE_PERCENTAGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input here :");

        System.out.println("enter number of bengali :");
        int bengali = sc.nextInt();

        System.out.println("enter number of english :");
        int english = sc.nextInt();

        System.out.println("enter number of math :");
        int math = sc.nextInt();

        System.out.println("enter number of phyics :");
        int phyics = sc.nextInt();

        System.out.println("enter number of chemistry :");
        int chemistry = sc.nextInt();

        int sum = bengali + english + math + phyics + chemistry;
        int percentage = ( sum*100/500);
        System.out.println(percentage);
    }
}
