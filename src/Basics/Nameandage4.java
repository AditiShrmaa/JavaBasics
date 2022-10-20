package Basics;

import java.util.Scanner;

public class Nameandage4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : " );
        String name = sc.next();
        System.out.println("Enter your age : " );
        int age = sc.nextInt();
        System.out.println("Hello "+name+","+" you are " +age+ " years old. ");
    }
}
