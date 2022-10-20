package Basics;

import java.util.Scanner;

public class Simpleinterest9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amount : ");
        int p = sc.nextInt();
        System.out.println("Enter Time : ");
        int t = sc.nextInt();
        System.out.println("Enter Rate of interest : ");
        int r = sc.nextInt();

        int SI = (p * r * t) / 100;
        System.out.println("Simple Interest = " + SI);
    }
}
