package com.company;

import  java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner nameInput = new Scanner(System.in);
        System.out.println("Hi! What's your name?");
        String name = nameInput.nextLine();

        Magic numm = new Magic();
        int num = numm.number();
        Magic mess = new Magic();
        String mes = mess.message();

        System.out.println("Hey " + name + "! Your lucky number is " + num + ". " + mes);

        Scanner optionInput = new Scanner(System.in);
        System.out.println("Press 0 to exit, 1 for a listing of the name and randomNumber of the object, or 2 to enter another name");
        int option = optionInput.nextInt();

        if (option == 0) {
            System.out.println("CYA PIZZA *cue exit*");
        } else if (option == 1) {
            System.out.println("Name: " + name + ", Lucky number: " + num);
        } else if (option == 2) {
            Scanner newName = new Scanner(System.in);
            System.out.println("Enter a new name");
            String newnew = newName.nextLine();

            System.out.println("Hey " + newnew + "! Your lucky number is " + num + ". " + mes);
        } else {
            System.out.print("Bro... do you not follow directions?");
            System.out.println("BYE DUMMY! *exit*");
        }


    }
}
