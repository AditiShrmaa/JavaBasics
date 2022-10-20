package Loops;

import java.util.Scanner;

public class Factors37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("FACTORS ARE:-");
        for (int i=1;i<=num;i++){
            if (num%i==0) {
                System.out.print( i + " ");
            }

        }

    }
}
