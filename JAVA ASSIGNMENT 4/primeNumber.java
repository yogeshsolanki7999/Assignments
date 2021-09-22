package com.GeekstersAssignments;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("ENTER START NUMBER");
       int start=scan.nextInt();
        System.out.println("ENTER END NUMBER");
        int end=scan.nextInt();
        System.out.println(prime(start,end));

    }
    public static int prime(int x,int y){
int i,j;
        for (i=x;i<=y;i++){
            for ( j=2;j<i;j++){
                if (i%j==0){
                    break;
                }
            }
            if (i==j){
                System.out.println(i);
            }

        }


  return i;  }

}