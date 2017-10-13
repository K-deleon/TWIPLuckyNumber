package com.company;

import  java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner nameInput = new Scanner (System.in);
        System.out.println("Hi! What's your name?");
        String name = nameInput.nextLine();

        Magic numm = new Magic();
        int num = numm.number();
        Magic mess = new Magic();
        String mes = mess.message();

        System.out.println("Hey " + name + "! Your lucky number is " + num + ". " + mes);

    }
}
