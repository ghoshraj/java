package com.company;

import java.util.LinkedHashSet;

public class REMOVE_DUPLICATE_ARRAY {
    /*  public static  void removeduplicate(int [] a){
          LinkedHashSet<Integer> x = new LinkedHashSet<>();
          for (int i = 0; i < a.length - 1; i++)
              x.add(a[i]);
              System.out.print(x);
          }

      public static void main(String[] args) {
          int[]a = {10,20,10,30,40,50,20,10,20};
          removeduplicate(a);
      }
  }
     */
    public static void main(String[] args) {
  char []a = {'r' , 'a' , 'j' , 'e' , 'r' , 'n' , 'r' , 'a'};
  LinkedHashSet<Character> ch = new LinkedHashSet<>();
  for (char i = 0; i < a.length - 1; i++)
      ch.add(a[i]);
        System.out.println(ch);
    }
}
