package Loops;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        if (count==10) {
            System.out.println(count);
        }
        else{
            System.out.println("illegal ISBN");
        }


    }
}
