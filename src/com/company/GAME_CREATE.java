package com.company;

import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int numberofgases = 0;
    public int inputnumber;

    public int getNumberofgases() {
        return numberofgases;
    }

    public void setNumberofgases(int numberofgases) {
        this.numberofgases = numberofgases;
    }
    game(){
        Random r = new Random();
        this.number = r.nextInt(50);
    }
    void takeuserinput(){
        System.out.println("GUESS THE NUMBER :");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    boolean iscoorectnumber(){
        numberofgases++;
        if(inputnumber == number){
            System.out.println("YOU GUESS THE RIGHT NUMBER & YOU WON THE GAME :"+ numberofgases);
            return true;
        }
        else if(inputnumber<number){
            System.out.println("TO LOW:");
        }
        else if(inputnumber>number){
            System.out.println("TO HIGH:");
        }
        return false;

    }
}
public class GAME_CREATE {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b){
            g.takeuserinput();
            b=g.iscoorectnumber();
        }
    }
}
