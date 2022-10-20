package Basics;

import java.util.Scanner;

public class Temperature8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Farhenite:");
        double temp = sc.nextDouble();
        double temp2 = ((temp-32)*5)/9;
        System.out.println("Temperature in celsius:"+temp2);
    }
}
