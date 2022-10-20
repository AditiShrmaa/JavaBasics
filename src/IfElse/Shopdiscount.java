package IfElse;

import java.util.Scanner;

public class Shopdiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if (amount>0 && amount<=5000){
            System.out.println(amount-0);
        }


        else if (amount>5000 && amount<=7000){
            System.out.println( amount-(amount*5)/100);
        }

    }
}
