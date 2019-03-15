package com.company;

import java.util.Scanner;

public class Midterm02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double unitprice = 229.00;
        double discount = 0.0;
        double quantity;
        System.out.println("How Many Software Modules Would You Like to Order?");
        quantity = scan.nextDouble();

        if(quantity >= 10 && quantity <=19){
            discount = 0.10;
        }else if(quantity >= 20 && quantity <=29){
            discount = 0.15;
        }else if(quantity >= 30 && quantity <= 49){
            discount = 0.25;
        }else if(quantity >= 50){
            discount = 0.30;
        }

        double sub_total = unitprice * quantity;
        double total = sub_total - (sub_total * discount);

        System.out.println("You ordered: " + quantity + " modules");
        System.out.println("Your discount is: " + (discount * 100) + "%");
        System.out.println("Your total is: $" + total);

    }
}
