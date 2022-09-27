package com.company;

import java.util.Scanner;

public class amstrong_number {
    public static void main(String[] args) {

        int number , originalnumber, remainder, result = 0;
        System.out.println("enter 3 digit number -->");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        originalnumber = number;

        while (originalnumber != 0)
        {
            remainder = originalnumber % 10;
            result += remainder*remainder*remainder; // Math.pow(remainder, 3);
            originalnumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

    }
}
