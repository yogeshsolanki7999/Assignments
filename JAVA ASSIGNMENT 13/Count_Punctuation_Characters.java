package com.GAssignments;

import java.util.Locale;

public class Count_Punctuation_Characters {
    public static void main(String[] args) {
        String str="He said,'The mailman loves you.'I heard it with my own ears.";
        String punc=str.toLowerCase();
        char  [] ch=punc.toCharArray();
        int count=0;

        for (int i=0;i<=punc.length()-1;i++){
            if (ch[i]==' '){
                continue;
            }
            else if (ch[i]>='a' && ch[i]<='z'){
                continue;
            }
            count++;


        }
        System.out.println("THE ALL PUNCTUATION CHARACTER PRESENT IN THE STRING IS  "+count);
    }
}
