package Patterns;

import java.util.Scanner;

public class Mirroredrighttriangle60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n - i; i++) {
                System.out.println("  ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
