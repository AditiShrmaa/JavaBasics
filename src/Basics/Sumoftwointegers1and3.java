package Basics;

import java.util.Scanner;

public class Sumoftwointegers1and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : " );
        int a = sc.nextInt();
        System.out.println("Enter Second Number : " );
        int b = sc.nextInt();
        System.out.println("Sum of given Digits : " + (a+b));
    }
}
