package com.company;

public class REVERSE_ARRAY{
    public static void main(String[] args) {
        int[]marks = {45,56,87,43,98,50,90};
        for (int i = marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}
