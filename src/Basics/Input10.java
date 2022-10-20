package Basics;

import java.util.Scanner;

public class Input10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a==b&&b==c){
            System.out.println("ALL ARE EQUAL");
        }

     else if (a==b||b==c){
            System.out.println("ANY TWO ARE EQUAL");
        }
        else{
            System.out.println("ALL ARE DIFFERENT");
        }

    }
}
