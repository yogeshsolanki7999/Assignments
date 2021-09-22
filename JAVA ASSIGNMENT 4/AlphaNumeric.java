package com.GeekstersAssignments;

import java.util.Scanner;

public class AlphaNumeric {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER ANY ALPHANUMERIC STRING");
        String str=scan.nextLine();
        alpha(str);

    }

    public static void alpha(String str){
        char []ar=str.toCharArray();
        int c=0;
        int n=0;

        for (int i=0;i<= ar.length-1;i++){
            if (ar[i]>='a' && ar[i]<='z' || ar[i]>='A'&& ar[i]<='Z'){
                c=1;
            }
            if (ar[i]>='0' && ar[i]<='9'){
                n=1;
            }

            }
        if (n==1 && c==1){
            System.out.println("IT IS AN ALPHANUMERIC STRING");

        }
        else{
            System.out.println("IT IS NOT AN ALPHANUMERIC STRING");

        }



    }
}
