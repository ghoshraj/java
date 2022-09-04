package com.company;

import java.util.Scanner;

public class ROTATE_A_NUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR DIGIT:");
        int n = sc.nextInt();
        System.out.println("ENTER HOW MANY TIMES ROTATE:");
        int k = sc.nextInt();

        int temp =n;
        int nod = 0; // nod-->number of digit
        while (temp > 0){
            temp =temp / 10;
            nod++;
        }

        k = k % nod;
        if (k < 0){
            k = k + nod;
        }

        int div = 1; //div-->diviser
        int mu =1;   //mu-->multiply
        for (int i =1; i<=nod;i++){
            if(i <= k){
                div = div * 10;
            }
            else {
                mu = mu * 10;
            }
        }

        int q = n / div; // q -->qousent
        int r = n % div; //r-->reminder

        int rn = r * mu +q; //rn-->rotate number
        System.out.println(rn);
    }
}
