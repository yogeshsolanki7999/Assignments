package com.GAssignments;

import java.util.Locale;

public class Count_vowel_and_Consonant {
    public static void main(String[] args) {
        String str="This is a really simple sentance";
        String str1=str.toLowerCase();
        int vcount=0;
        int count=0;
        char [] ch=str1.toCharArray();
        for (int i=0;i<=ch.length-1;i++){
            if (ch[i]==' '){
                continue;
            }
            else if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
               vcount++;
            }
            else {
                count++;
            }
        }
        System.out.println("THE NUMBER OF VOWELS IN THE STRING IS      "+vcount);
        System.out.println("THE NUMBER OF CONSONANTS IN THE STRING IS  "+count);

    }
}
