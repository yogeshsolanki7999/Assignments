package com.GeekstersAssignments;

import java.util.Locale;
import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String str= scan.nextLine();
        scan.close();

        System.out.println(capitalization(str));

    }

    public static String capitalization(String  capstring){
      return  capstring.toUpperCase();

        }
    }



