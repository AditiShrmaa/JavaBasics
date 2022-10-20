package Loops;

import java.util.Scanner;

public class Sumofactors38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i ;
        System.out.println("FACTORS ARE:-");
        for ( i=1;i<=num;i++){
            if (num%i==0) {
                System.out.println(  i);
                sum = sum+i;
            }
        }
        System.out.println("Sum of factors are = " + sum);
        }
}
