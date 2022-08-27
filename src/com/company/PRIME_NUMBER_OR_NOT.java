package com.company;

import java.util.Scanner;

public class PRIME_NUMBER_OR_NOT {
    public static void main(String[] args) {

      /* // QUESTION : CHECK THE NUMBER PRIME OR NOT.
      //ANSWER----

       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0;i<n;i++){
         int t = sc.nextInt();

         int count =0;
         for (int div = 2; div * div <=t;div++){
             if(t%div == 0){
                 count++;
                 break;
             }
         }
         if (count == 0){
             System.out.println("THE NUMBER IS PRIME:");
         }
         else {
             System.out.println("THE NUMBER IS NOT PRIME:");
         }
     }
    }
}
       */
        //QUESTION : PRINT PRIME NUMBER BETWWEN LOW TO HIGH.
        //ANSWER----

        Scanner sc = new Scanner(System.in);
        System.out.println("START SEARCHING FROM:");
        int low = sc.nextInt();
        System.out.println("END SEARCHING:");
        int high = sc.nextInt();

        for (int i = low; i<= high; i++){
           int count = 0;

           for (int div = 2; div * div <= i; div++) {
               if (i % div == 0) {
                   count++;
                   break;
               }
           }
            if (count == 0){
                System.out.println("PRIME NUMBERS IS  :" + i);
            }
            else {

            }
        }
    }
}