package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Midterm05 {
    public static void main(String[] args){
        System.out.print("Enter number of days: ");
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        double pennys = 1;
        double pay = 0;

        for(int day = 1; day < (days + 1); day++){
            System.out.println("Day: " + day + " Today's Pay: $" + new DecimalFormat("#0.00").format(pennys/100));
            pay += pennys;
            pennys *= 2;
        }

        System.out.println("Your total pay is: $" + (pay/100));
    }
}
