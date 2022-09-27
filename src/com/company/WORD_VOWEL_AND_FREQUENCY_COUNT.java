package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WORD_VOWEL_AND_FREQUENCY_COUNT {
    public void wordcount(String str){
        int wordcount = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            switch (ch){
                case ' ':
                case '.':
                    wordcount++;
            }
        }
        System.out.println("total words in this sentence are -->" + wordcount);
    }
    public void vowelcount(String str){
        int vowelcount = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            switch (ch) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelcount++;
            }
        }
        System.out.println("total vowels in this sentence are -->" + vowelcount);
    }
    public void frequencycount(String str){
        TreeMap<Character , Integer>tm = new TreeMap<>();
        for (int i = 0; i < str.length(); i++){
            Integer c = tm.get(str.charAt(i));
            if (tm.get(str.charAt(i)) == null){
                tm.put(str.charAt(i) , 1);
            }
            else {
                tm.put(str.charAt(i) , ++c);
            }
        }
        for (Map.Entry entry : tm.entrySet()){
            System.out.println("character = " + entry.getKey());
            System.out.println("frequency = " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A sentence must be end with. and not end with space
        System.out.println("enter string-->");
        String str = sc.nextLine();
        WORD_VOWEL_AND_FREQUENCY_COUNT w = new WORD_VOWEL_AND_FREQUENCY_COUNT();
        w.wordcount(str);
        w.vowelcount(str);
        w.frequencycount(str);
    }
}
