package Basics;

import java.util.Scanner;

public class Rectangle5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : " );
        int a = sc.nextInt();
        System.out.println("Enter breadth : " );
        int b = sc.nextInt();
        System.out.println("Area of rectangle : " + (a*b));
        System.out.println("Perimeter : " + (2*(a+b)));
    }
}
