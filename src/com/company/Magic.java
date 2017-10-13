package com.company;

public class Magic {

    public int luckynum;
    public String messa;


    public int number(){
        int num = (int)(Math.random()*10);
        if (num == 0) {
            luckynum = (int)(Math.pow(10, 2));
        } else {
            luckynum = (int) Math.pow(num, 2);
        }
        return luckynum;
    }

    public String message() {

        int randNum = (int) (Math.random() * 5);
        if (randNum == 0) {
            messa = "Have a nice day!";
        } else if (randNum == 1) {
            messa = "Have a great day!";
        } else if (randNum == 2) {
            messa = "Have an awesome day!";
        } else if (randNum == 3) {
            messa = "Have a fantastic day!";
        } else if (randNum == 4) {
            messa = "Have a super day!";
        }

        return messa;
    }

}