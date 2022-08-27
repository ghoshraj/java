package com.company;

import java.util.Scanner;

public class CALCULATE_TAX {
    public static void main(String[] args) {
        System.out.println("enter your income :");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax =0;

        if(income<=2.5){
            tax =tax+0;
        }

        else if(income>2.5f && income<=5f){
            tax = (float) (tax +0.05f * (income-2.5));
        }

        else if(income>5f && income<=10f){
            tax = tax +0.05f * (5.0f - 2.5f);
            tax = (float) (tax +0.2f * (income-5));
        }

        else if(income>10f ){
            tax = (float) (tax + 0.05 *(5.0f - 2.5f));
            tax = tax +0.2f * (10.0f - 5f);
            tax = tax +0.3f * (income-10);
        }
        System.out.println(tax);
    }
}
