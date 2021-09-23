package com.GeekstersAssignments;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class reverseStringArray {

    public static void main(String[] args) {
        //1ST WAY OF REVERSING THIS
        System.out.println("1ST WAY OF REVERSING THIS");
        String str="Geekster is my class room";
        //EXCPECTED OUT PUT == room class is my geekster;
        String[] rev =str.split(" ");
        //FOR FINDING THR LENGTH OF ARRAY
        int length= rev.length;

        //FOR CALCULATING THE GREATEST INTERGER MEANS HERE LENGTH IS 5 WHICH IS DIVIDED BY 2 THEN THE RESULT IS 2.5
        //THIS FUNCTION GIVES US 2 AS THE GREATEST INTEGER
        int mid=Math.floorDiv(length,2);
        String temp=" ";
        //swapping the values of rev[i] and rev[i-length-1]
       for (int i=0;i<=mid;i++) {
            temp = rev[i];
            rev[i]=rev[length-i-1];
            rev[length-i-1]=temp;
        }
        for (String element:rev
             ) {
            System.out.println(element);
        }

        System.out.println("");
        System.out.println("");

      //SECOND WAY OF REVERSING THIS
        System.out.println("SECOND WAY OF REVERSING THE STRING");
        String str2="Geekster is my class room";

        String[] rev2 =str.split(" ");

        int length2= rev2.length;
       for (int j=0;j<rev2.length;j++){
           System.out.println(rev2[length-j-1]);
       }
    }
}
