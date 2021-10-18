package com.GAssignments;

import java.util.HashMap;

public class Tit_for_tat_using_hashmap {
    public static void main(String[] args) {
        String str="tit for tat is a proverb";
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i=0;i<=str.length()-1;i++){
            Character ch=str.charAt(i);
            if (ch>='a' && ch<='z'){
            if (map.containsKey(ch)){
               Integer value=map.get(ch);
               value=value+1;

               map.put(ch,value);

            }else {
                map.put(ch,1);
            }

        }}
        int max=0;
        char cmax=0;
        for (char key:map.keySet()
             ) {
            if (max<map.get(key)){
            max=map.get(key);
            cmax=key;
            }

        }
        System.out.println("MAX OCCURANCE CHRACTER IS "+cmax+"="+max);


    }

}
