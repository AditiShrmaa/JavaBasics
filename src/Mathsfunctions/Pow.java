package Mathsfunctions;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of principle-");
        float P = sc.nextFloat();
        System.out.println("Enter the value of Rate of interest-");
        float R = sc.nextFloat();
        System.out.println("Enter the value of Time period-");
        float T = sc.nextFloat();
        System.out.println("Enter the value of number of times interest compounded-");
        float N =sc.nextFloat();

        double amount = P*Math.pow(1+(R/N),N*T);
        double CI = amount-P;
        System.out.println( "Compound Interest = " + CI);

    }
}
