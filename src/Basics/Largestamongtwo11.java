package Basics;

import java.util.Scanner;

public class Largestamongtwo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>y){
            System.out.println(x+" is greater than "+y);
        }
        else {
            System.out.println(y+" is greater than "+x);
        }
    }
}
