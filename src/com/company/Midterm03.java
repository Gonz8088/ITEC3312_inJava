package com.company;

import java.text.DecimalFormat;

public class Midterm03 {
    public static void main(String[] args){
        double sea_level = 0;
        double rate = 3.1;   //milimeters

        for(int year = 2019; year < 2040; year++){
            sea_level += rate;
            System.out.println("Year: " + year);
            System.out.println("Ammount Risen: " + new DecimalFormat("#0.00").format(sea_level) + "mm");
        }
    }
}
