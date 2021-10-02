package com.geekclass;

import java.util.Scanner;

public class EvenOddUsingOr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int number=s.nextInt();
        int OR=number|1;

        if (OR==number+1){
            System.out.println("NUMBER IS EVEN");
        }
        else {
            System.out.println("NUMBER IS ODD");
        }
    }
}
