package com.company;

import  java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner nameInput = new Scanner (System.in);
        System.out.println("Hi! What's your name?");
        String name = nameInput.nextLine();

        int num = (int)(Math.random()*10);
        int luckynum = (int)Math.pow(num, 2);
        System.out.println("Hey " + name + "! Your lucky number is " + luckynum + ", " + num);

    }
}
