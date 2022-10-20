package Loops;

import java.util.Scanner;

public class Table32 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int n = abc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println( n + " * " + i +" = "+ n*i);
        }


    }
}
