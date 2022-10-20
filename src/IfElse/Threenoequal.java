package IfElse;

import java.util.Scanner;

public class Threenoequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("a=");
        int a = sc.nextInt();
        System.out.println("b=");
        int b = sc.nextInt();
        System.out.println("c=");
        int c = sc.nextInt();

        if (a==b && b==c){
            System.out.println("All are equal.");
        }
        else if (a==b || b==c || c==a)  {
            System.out.println("Any two are equal.");
        }
        else {
            System.out.println("All are different.");
        }

    }

}
