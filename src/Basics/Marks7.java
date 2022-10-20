package Basics;

import java.util.Scanner;

public class Marks7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Marks in Maths: " );
   double a = sc.nextDouble();
    System.out.println("Enter Marks in Computer: " );
    double b = sc.nextDouble();
    System.out.println("Enter Marks in English: " );
    double c = sc.nextDouble();

    double sum = a+b+c;
    System.out.println("Total marks : "+ sum );

    double percentage = (sum/300)*100;
    System.out.println("Percentage : "+percentage +"%");
}
}
