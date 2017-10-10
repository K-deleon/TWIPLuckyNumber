package com.company;

import  java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner nameInput = new Scanner (System.in);
        System.out.println("Hi! What's your name?");
        String name = nameInput.nextLine();

        int num = (int)(Math.random()*10);
        int luckynum = (int)Math.pow(num, 2);
        System.out.println("Hey " + name + "! Your lucky number is " + luckynum);

        int randNum = (int)(Math.random()*5);
        if (randNum == 0){
            System.out.println("Have a nice day!");
        } else if (randNum == 1){
            System.out.println("Have a great day!");
        } else if (randNum == 2){
            System.out.println("Have an awesome day!");
        } else if (randNum == 3){
            System.out.println("Have a fantastic day!");
        } else if (randNum == 4){
            System.out.println("Have a super day!");
        }

    }
}
