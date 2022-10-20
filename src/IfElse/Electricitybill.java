package IfElse;

import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter electricity units - ");
        int units = sc.nextInt();
        double amount =0;
        if (units>400) {
            amount = (units-400)*13;
        units = 400;
        }
        if (units>200 && units<=400){
            amount = amount +(units-200)*8
        }

    }
}
