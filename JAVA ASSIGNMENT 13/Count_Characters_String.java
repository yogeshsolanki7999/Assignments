package com.GAssignments;

public class Count_Characters_String {
    public static void main(String[] args) {
        String str="The best of both worlds";
        int count=0;
        char [] ch=str.toCharArray();
        for (int i=0;i<=str.length()-1;i++){
            if (ch[i]==' '){
                continue;
            }else {
                count++;
            }
        }
        System.out.printf("THE TOTAL NUMBERS OF CHARCTERS IN THE STRING IS ( %d )",count);
    }
}
