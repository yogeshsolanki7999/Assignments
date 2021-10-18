package com.GAssignments;

public class Swap_two_Strings {
    public static void main(String[] args) {
        String str1 ="HELLO";
        String str2="WORLD";

        str1=str1+str2;
        str2=str1.substring(0,(str1.length()-str2.length()));
        str1= str1.substring(str1.length()-str2.length(),str1.length());

        System.out.println("STR1 AFTER SWAPPING IS  "+str1);
        System.out.println("STR2 AFTER SWAPPING IS  "+str2);
    }
}
