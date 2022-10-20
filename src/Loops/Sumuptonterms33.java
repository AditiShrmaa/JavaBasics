package Loops;

import java.util.Scanner;

public class Sumuptonterms33 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int n = abc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {

            sum=sum+i;

        }
        System.out.println("sum=" + sum);
    }
}
