package IfElse;

import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Gender-");
        char gender = sc.nextLine().charAt(0);

        if (gender == 'M' || gender == 'm'){
            System.out.println("Good morning SIR");
        }
        if (gender == 'F' || gender == 'f'){
            System.out.println("Good morning MAM");
        }


    }
}
