package com.GeekstersAssignments;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ReplaceNumber {
    public static void main(String[] args) {

    int [] ar=new int[5];
    Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE FULL ARRAY ELEMENTS BY INDEX");

    for(int i=0;i<=ar.length-1;i++){
        System.out.println("ENTER THE INDEX OF "+i);
        ar[i]=scan.nextInt();
    }

        System.out.println("ENTER THE NUMBER PRESENT IN ARRAY YOU WANT TO REPLACE");
                 int num=scan.nextInt();
      for (int j=0;j<=ar.length-1;j++){
         if(num==ar[j]){
             ar[j]=0;

         }else{
             System.out.println("NUMBER YOU ENTER IS NOT PRESENT IN ARRAY");
         }
            }


        System.out.println("THE NEW ARRAY WITH MISSING NUMBER IS ");

        for(int a=0;a<=ar.length-1;a++){
            System.out.println(ar[a]);

        }

        }


}
