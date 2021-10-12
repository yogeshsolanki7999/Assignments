package com.GAssignments;

import java.util.Locale;

public class Panagram {

    public boolean pans(String str1){
        str1=str1.toLowerCase();

        for (char i='a';i<='z';i++){

            String ch=String.valueOf(i);

            if (str1.contains(ch)){
                continue;
            }else {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Panagram p=new Panagram();
        String str="ABcdefghijklmnopqstrurrrrscsdvwzxy";

        if (p.pans(str)){
            System.out.println("true");
        }
        else {
            System.out.println(false);
        }

    }


}
